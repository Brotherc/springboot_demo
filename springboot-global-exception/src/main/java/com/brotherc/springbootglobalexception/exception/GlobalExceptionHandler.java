package com.brotherc.springbootglobalexception.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Brotherc
 * @date: 2019/7/14 13:19
 */
@ControllerAdvice//切面
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)//捕获运行时异常
    @ResponseBody
    public Map<String,Object> exceptionHander(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errorMsg", "系統错误!");
        return map;
    }
}