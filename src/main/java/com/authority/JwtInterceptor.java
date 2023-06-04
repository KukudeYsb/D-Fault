package com.authority;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utils.JwtUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 拦截器
 *
 * @author : 杨世博
 * @date: Created in 23:40 2023/6/1
 */
public class JwtInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        Map<String, Object> map = new HashMap<>();
        try {
            JwtUtils.verify(token);
            return true;
        } catch (TokenExpiredException e) {
            map.put("state", false);
            map.put("msg", "Token已经过期!!!");
        } catch (SignatureVerificationException e) {
            map.put("state", false);
            map.put("msg", "签名错误!!!");
        } catch (AlgorithmMismatchException e) {
            map.put("state", false);
            map.put("msg", "加密算法不匹配!!!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("msg", "无效token~~");
        }
        String json = new ObjectMapper().writeValueAsString(map);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println(json);
        return false;
    }
}
