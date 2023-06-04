package com.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 配置全局异常
 *
 * @author : 杨世博
 * @date: Created in 23:40 2023/6/1
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        String msg = e.getMessage();
        if (msg == null || msg.equals("")) {
            msg = "服务器出错";
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1000);
        jsonObject.put("message", msg);
        return jsonObject;
    }
}
