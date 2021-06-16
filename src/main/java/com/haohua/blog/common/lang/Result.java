package com.haohua.blog.common.lang;

import lombok.Data;

@Data
public class Result {
    private String code;
    private String msg;
    private Object data;
    private static Result success(Object data){
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static Result success(String msg, Object data){
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg(msg);
        return m;
    }
    public static Result fail(String msg){
        Result m = new Result();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(msg);
        return m;
    }
    public static Result fail(String msg, Object data){
        Result m = new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(msg);
        return m;
    }
}
