package com.zjp.model.response;

/**
 * 所有异常返回
 *
 * Created by zhang on 2017/5/11.
 */
public class WebResponse {

    private Integer code;
    private String msg;

    public WebResponse() {
    }

    public WebResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "WebResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
