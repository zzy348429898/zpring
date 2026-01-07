package org.zzy.common.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.zzy.common.api.Result;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        e.printStackTrace();
        return Result.failed(e.getMessage());
    }
}