package com.onroadrui.vo;

/**
 * Created by onroadrui on 17/10/31.
 */
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T date;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public ResultVO(Integer code, String message, T date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }

    public ResultVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultVO() {
    }

    public static ResultVO success(Object object)  {
        ResultVO result = new ResultVO();
        result.setCode(200);
        result.setMessage("success");
        result.setDate(object);
        return result;
    }

    public static ResultVO error(Integer code, String message) {
        ResultVO result = new ResultVO(code, message);
        return result;
    }


}
