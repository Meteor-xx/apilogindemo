package com.webdemo.weapi.action.domain;

import java.util.HashMap;
import java.util.Map;

public class ApiConconts {
    /**
     * 分页开始位置
     */
    public static final String PAGE_START = "start";
    /**
     * 令牌token
     */
    public static final String ACCESS_TOKEN = "accessToken";
    /**
     * 私有域，用户填写内容，服务器原封返回
     */
    public static final String RES_SRT = "resSrt";
    /**
     * 当前页数
     */
    public static final String PAGE = "page";
    /**
     * 每页多少条，默认10条
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序字段
     */
    public static final String ORDER_BY = "orderBy";

    /**
     * 排序方法：asc、desc
     */
    public static final String DESC_OR_ASC = "descOrAsc";

    /**
     * 调用接口的版本号
     */
    public static final String VERSION = "version";
    /**
     * 数据对象
     */
    public static final String DATA = "data";

    /**
     * 开始时间
     */
    public static final String START_TIME = "startTime";
    /**
     * 结束时间
     */
    public static final String END_TIME = "endTime";

    /**
     * 查询数据类型
     * 1 查询满足条件的所有数据
     * 2 查询第一包和最后一包数据
     */
    public static final String DATA_TYPE = "dataType";
    /**
     * 查询数据类型
     * 1 查询满足条件的所有数据
     */
    public static final Integer DATA_TYPE_ALL = 1;
    /**
     * 查询数据类型
     * 2 查询满足条件的所有数据
     */
    public static final Integer DATA_TYPE_FIRST_AND_LAST = 2;
    /**
     * 分页页码默认值为第一页
     */
    public static final String PAGE_DEFAULT_VALUE = "1";
    /**
     * 分页每页数量默认值为十条
     */
    public static final String PAGE_SIZE_DEFAULT_VALUE = "10";


    public static final Long H_TO_S = 3600L;

    public static final Integer OK = 1000;
    public static final Integer PARAM_EMPTY = 4001;
    public static final Integer PARAM_INVALID  = 4002;
    public static final Integer NO_PERMISSION_ACCESS = 4003;
    public static final Integer RESULTS_EMPTY = 4004;
    public static final Integer USER_ERROR = 4005;
    public static final Integer ACCOUNT_ABNORMAL = 4006;
    public static final Integer VERSION_NUMBER_ABNORMAL = 4007;
    public static final Integer PASSWORD_INVALID = 4008;
    public static final Integer LATITUDE_LONGITUDE_INVALID = 4009;
    public static final Integer DATA_ERROR = 4013;
    public static final Integer START_TIME_ERROR = 4014;
    public static final Integer END_TIME_ERROR = 4015;
    public static final Integer DATA_TYPE_ERROR = 4016;
    public static final Integer TIME_SPAN_ERROR = 4018;
    public static final Integer OPERATOR_CODE_ERROR = 4019;
    public static final Integer ACTION_ERROR = 4020;//操作失败
    public static final Integer INTERNAL_INTERFACE_ABNORMAL = 5000;
    public static final Integer TOKEN_INVALID = 5001;
    public static final Integer TOKEN_GENERATED_ERROR = 5002;

    public static Map<Integer, String> errorInfoMap = null;

    static {
        errorInfoMap = new HashMap<Integer, String>();
        errorInfoMap.put(OK, "OK");
        errorInfoMap.put(PARAM_EMPTY, "Request parameter is empty or Missing parameters");
        errorInfoMap.put(PARAM_INVALID, "Invalid request parameter");
        errorInfoMap.put(NO_PERMISSION_ACCESS, "No permission access service");
        errorInfoMap.put(RESULTS_EMPTY, "Query results are empty or no corresponding results");
        errorInfoMap.put(USER_ERROR, "The user does not exist or the user name and password are incorrect");
        errorInfoMap.put(ACCOUNT_ABNORMAL, "Account status is abnormal");
        errorInfoMap.put(VERSION_NUMBER_ABNORMAL, "Service version number is abnormal");
        errorInfoMap.put(PASSWORD_INVALID, "Password at least 6");
        errorInfoMap.put(LATITUDE_LONGITUDE_INVALID, "Invalid format of latitude and longitude");
        errorInfoMap.put(DATA_ERROR, "Data is abnormal");
        errorInfoMap.put(START_TIME_ERROR, "Start time is abnormal");
        errorInfoMap.put(END_TIME_ERROR, "End time is abnormal");
        errorInfoMap.put(DATA_TYPE_ERROR, "Data type is abnormal");
        errorInfoMap.put(TIME_SPAN_ERROR, "Time span is abnormal");
        errorInfoMap.put(OPERATOR_CODE_ERROR, "Operator code is abnormal");
        errorInfoMap.put(INTERNAL_INTERFACE_ABNORMAL, "The internal interface code is abnormal");
        errorInfoMap.put(TOKEN_INVALID, "Token has expired or token is invalid, please retrieve it");
        errorInfoMap.put(TOKEN_GENERATED_ERROR, "Token generated error");
    }
    public static final Long ONE_MINUTE_TIME = 3600000L;
}
