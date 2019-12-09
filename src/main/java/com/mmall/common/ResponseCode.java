package com.mmall.common;

/**
 * @author: xu gang feng
 * @create: 2019-12-09 22:22
 */
public enum ResponseCode {
    SUCCESS(1, "成功"),
    ERROR(0,"失败"),
    FAIL(2, "错误"),
    NEED_LOGIN(3, "需要登陆");

    private final int code;
    private final String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
