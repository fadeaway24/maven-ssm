package com.common.exception;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/10/7 10:28
 *
 */
public enum HttpCode {
    BUSINESS_LOGIC_NOT_PASS(520,"Business Logic Error");

    private final int code;
    private final String msg;

    private HttpCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
