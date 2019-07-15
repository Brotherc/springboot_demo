package com.brotherc.springbootglobalexception.exception;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

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
    public Map<String,Object> exceptionHander(HttpServletRequest req, Exception e){
        // 如果返回的是View，方法的返回值低ModelAndView
        // ModelAndView modelAndView = new ModelAndView();
        // modelAndView.setView();
        // return modelAndView;

        // 如果返回值是String或json，那么需要在方法上添加ResponseBody注解
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errorMsg", "系統错误!");
        return map;
    }
}