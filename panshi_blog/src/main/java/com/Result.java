package com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result {
    private String msg;
    private Integer code;
    private Boolean success;
    private Object data;

    public Result(boolean success, String msg, int code, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.success = success;
    }

    public static Result success(Object data){
        return new Result(true,"success",200,data);
    }
    public static Result fail(int code,Object data){
        return new Result(false,"success",code,data);
    }
}
