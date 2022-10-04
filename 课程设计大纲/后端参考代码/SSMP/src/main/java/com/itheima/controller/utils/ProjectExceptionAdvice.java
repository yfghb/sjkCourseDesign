package com.itheima.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception exception) {
        exception.printStackTrace();
        return new R("异常!请稍后再试!");
    }
}//这个类的作用是为了前后端统一数据格式