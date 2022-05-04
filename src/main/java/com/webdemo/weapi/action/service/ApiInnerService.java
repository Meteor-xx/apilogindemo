package com.webdemo.weapi.action.service;

import com.webdemo.weapi.action.domain.ResponseDataListVO;
import com.webdemo.weapi.action.domain.TokenInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;

public interface ApiInnerService {
    TokenInfo handlerParamsData(HttpServletRequest request, HttpServletResponse response,
                                 Map<String,String> params, ResponseDataListVO responseDataListVO);
    void getRequestParam(HttpServletRequest request,Map<String,String> paramMap,String... params) throws Exception;
    Boolean checkRequestParam(Map<String,String> paramMap,String... params);
}
