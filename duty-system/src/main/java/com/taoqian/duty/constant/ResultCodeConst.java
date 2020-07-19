package com.taoqian.duty.constant;

public class ResultCodeConst {

    public static final Integer RESPONSE_SUCCESS_CODE = 200;
    public static final String RESPONSE_SUCCESS_MSG = "响应成功";

    public static final Integer TOKEN_REFRESH_CODE = 40100;
    public static final String TOKEN_REFRESH_MSG = "token刷新";

    public static final Integer TOKEN_ERROR_CODE = 40101;
    public static final String TOKEN_ERROR_MSG = "token错误";

    public static final Integer TOKEN_EXPIRE_CODE = 40102;
    public static final String TOKEN_EXPIRE_MSG = "token过期";

    public static final Integer PSW_ERROR_CODE = 40103;
    public static final String PSW_ERROR_MSG = "密码错误";

    public static final Integer USER_LOGOUT_CODE = 40104;
    public static final String USER_LOGOUT_MSG = "用户已登出";

    public static final Integer USER_NOT_EXIST_CODE = 40105;
    public static final String USER_NOT_EXIST_MSG = "该账户不存在";

    public static final Integer USER_ALREADY_EXIST_CODE = 40106;
    public static final String USER_ALREADY_EXIST_MSG = "该账户已经存在";

    public static final Integer USER_UNABLE_CODE = 40107;
    public static final String USER_UNABLE_MSG = "该账户被禁用";

    public static final Integer IDENTIFY_CODE_ERROR_CODE = 40108;
    public static final String IDENTIFY_CODE_ERROR_MSG = "验证码错误";

    public static final Integer LOGIN_UNCOMPLETED_CODE = 40109;
    public static final String LOGIN_UNCOMPLETED_MSG = "登录信息不完整";

    public static final Integer PERMISSION_FORBIDDEN_CODE = 40110;
    public static final String PERMISSION_FORBIDDEN_MSG = "用户无权访问";

    public static final Integer PARAMETER_NULL_CODE = 41101;
    public static final String PARAMETER_NULL_MSG = "参数为空";

    public static final Integer REGISTER_UNCOMPLETED_CODE = 40110;
    public static final String REGISTER_UNCOMPLETED_MSG = "注册信息不完整";

    public static final Integer PARAMETER_INVALID_CODE = 41102;
    public static final String PARAMETER_INVALID_MSG = "参数不合法";

    public static final Integer TOO_MANY_REQUEST_CODE = 41103;
    public static final String TOO_MANY_REQUEST_MSG = "请求过于频繁";

    public static final Integer FILE_EMPTY_CODE = 42101;
    public static final String FILE_EMPTY_MSG = "上传文件为空";

    public static final Integer DB_NULL_RESULT_CODE = 43101;
    public static final String DB_NULL_RESULT_MSG = "查询为空";

    public static final Integer FEIGN_ERROR_CODE = 45101;
    public static final String FEIGN_ERROR_MSG = "feign远程调用异常";

    public static final Integer EX_OTHER_CODE = 47101;
    public static final String EX_OTHER_MSG = "other error";

}
