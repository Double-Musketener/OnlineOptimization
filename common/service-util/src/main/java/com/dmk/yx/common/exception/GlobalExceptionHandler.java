package com.dmk.yx.common.exception;

import com.dmk.yx.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LangJ
 * @version 1.0
 */

@ControllerAdvice  //底层利用AOP
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody  //返回的格式为json
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail(e.getMessage());
    }


    @ExceptionHandler(YxException.class)
    @ResponseBody
    public Result  error(YxException e){
        return Result.fail(e.getMessage());
    }

}
