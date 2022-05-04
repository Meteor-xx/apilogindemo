package com.webdemo.weapi.action.service.impl;

import org.apache.commons.lang3.StringUtils;
import com.webdemo.weapi.action.domain.ApiConconts;
import com.webdemo.weapi.action.domain.Employee;
import com.webdemo.weapi.action.domain.ResponseDataListVO;
import com.webdemo.weapi.action.domain.TokenInfo;
import com.webdemo.weapi.action.service.ApiInnerService;
import com.webdemo.weapi.action.service.IEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

@Slf4j
@Service("apiInnerService")
public class ApiInnerServiceImpl implements ApiInnerService {


    @Autowired
    private IEmployeeService employeeService;


    @Override
    public TokenInfo handlerParamsData(HttpServletRequest request, HttpServletResponse response,
                                       Map<String,String> params, ResponseDataListVO responseDataListVO){
        TokenInfo ti = new TokenInfo();

        String resCode = "";
        String resMsg = "";
        Boolean flag = true;
        try {
            //赋值——将全部http的值全部读取出来
            getRequestParam(request,params, ApiConconts.ACCESS_TOKEN,ApiConconts.RES_SRT,ApiConconts.VERSION,
                    ApiConconts.DATA,ApiConconts.PAGE,ApiConconts.PAGE_SIZE);
        }catch (Exception e){
            e.printStackTrace();
            resCode = ApiConconts.PARAM_INVALID.toString();
            resMsg = ApiConconts.errorInfoMap.get(ApiConconts.PARAM_INVALID);
            flag = false;
            //log.error("参数赋值失败，参数传入失败");
        }

        //检验参数是否为空
        if(flag){
            Boolean paramFlag = checkRequestParam(params,ApiConconts.ACCESS_TOKEN,ApiConconts.VERSION,
                    ApiConconts.DATA);
            if (!paramFlag){
                resCode = ApiConconts.PARAM_EMPTY.toString();
                resMsg = ApiConconts.errorInfoMap.get(ApiConconts.PARAM_EMPTY);
                flag = false;
               // log.error("参数检验异常，参数传入为空");
            }
        }

        //检验token是否有效
        if(flag){
            Employee user = employeeService.checkToken(params.get(ApiConconts.ACCESS_TOKEN));
            ti.setEmployee(user);
            if(user == null || user.getTokenValidityTime().getTime()<new Date().getTime()){
                resCode = ApiConconts.TOKEN_INVALID.toString();
                resMsg = ApiConconts.errorInfoMap.get(ApiConconts.TOKEN_INVALID);
                flag = false;
             //   log.error("参数校验异常，token过期或无效");
            }
        }
        responseDataListVO.setResCode(resCode);
        responseDataListVO.setResMsg(resMsg);
        responseDataListVO.setResSrt(params.get("resSrt"));
        responseDataListVO.setData(new ArrayList<Object>());
        responseDataListVO.setVersion(params.get(ApiConconts.VERSION));
        ti.setCheck(flag);

        return ti;
    }

    @Override
    public void getRequestParam(HttpServletRequest request, Map<String, String> paramMap, String... params) throws Exception {
        Enumeration enu = request.getParameterNames();
        while (enu.hasMoreElements()){
            String paraName = (String) enu.nextElement();
            for (String str:params){
                if (paraName.equals(str)){
                    if(ApiConconts.DESC_OR_ASC.equals(paraName)){
                        paramMap.put(str,request.getParameter(str).toUpperCase());
                    }else {
                        paramMap.put(str,request.getParameter(str));
                    }
                    continue;
                }
            }
        }
    }

    @Override
    public Boolean checkRequestParam(Map<String, String> paramMap, String... params) {
        Boolean flag = true;
        for (String str:params){
            if (!paramMap.containsKey(str)|| StringUtils.isBlank(paramMap.get(str))){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
