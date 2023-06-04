package com.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.pojo.entity.User;

import java.util.Date;

/**
 * Token生成器
 *
 * @author : 杨世博
 * @date: Created in 22:25 2023/6/1
 */
public class JwtUtils {
    private static final String TOKEN = "token!Q@W3e4r";

    /**
     * 过期时间5分钟
     */
    private static final long EXPIRE_TIME = 7 * 24 * 60 * 1000;

    /**
     * 根据用户名和密码获取token
     */
    public static String getToken(String username) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        String token = "";
        token = JWT.create()
                .withClaim("username", username)
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256(TOKEN));
        return token;
    }

    /**
     * 根据token获取用户名
     */
    public static String getUsername(String token) {
        return JWT.decode(token).getAudience().get(0);
    }

    /**
     * 验证token
     */
    public static void verify(String token) {
        JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }

}
