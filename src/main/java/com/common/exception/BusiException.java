package com.common.exception;

import java.io.Serializable;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/10/6 10:36
 *
 */
public class BusiException extends RuntimeException implements Serializable {
    private int code;
    private String msg;

    public BusiException(){
        this.code = 520;
        this.msg = "默认业务异常";
    }

    public BusiException(String msg){
        this.code = 520;
        this.msg = msg;
    }

    public BusiException(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString(){
        return "BusiException{"+
                "code:"+this.code+
                ",msg:'"+this.msg+"\'"+
                "}";
    }
}
