package com.zheng.cms.common.constant;

/**
 * cms系统接口结果常量枚举类
 * Created by shuzheng on 2017/2/19.
 */
public enum CmsResultConstant {

    SUCCESS(1, "success");

    public int code;

    public String message;

    CmsResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
