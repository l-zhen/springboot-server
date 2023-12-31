package com.keafmd.config;

import com.keafmd.common.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author lz
 * @Date 2022/3/11 14:24
 * @Version 1.0
 */
@RestControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler
    public CommonResult exceptionHandler(HttpServletRequest request,Exception ex){
        ex.printStackTrace();
        if (ex instanceof NoHandlerFoundException){
            return CommonResult.nohandler();
        }
        return CommonResult.failed(ex.getMessage());
    }
}
