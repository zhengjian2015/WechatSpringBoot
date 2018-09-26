package com.imooc.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/*
正常开发需要对不同异常，特别处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    @ResponseBody
    public Map<String,Object> handeException(Exception ex) {
        System.out.println("出现全局异常"+ex);
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",false);
        modelMap.put("errMsg", ex.getMessage());
        return modelMap;
    }
}