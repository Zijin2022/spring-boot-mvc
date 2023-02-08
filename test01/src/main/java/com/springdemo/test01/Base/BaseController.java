package com.springdemo.test01.Base;

public class BaseController {
    public static <T> ResultBase<T> success(T data) {
//        return new ResultBase<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
        return null;
    }
}
