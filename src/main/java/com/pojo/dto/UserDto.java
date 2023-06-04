package com.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author : 杨世博
 * @date: Created in 0:50 2023/6/1
 */
@Data
public class UserDto implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 电话号码
     */
    private String phone;
}
