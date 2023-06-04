package com.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录dto
 *
 * @author : 杨世博
 * @date: Created in 0:43 2023/6/1
 */
@Data
public class LoginDto implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;
}
