package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.dto.LoginDto;
import com.pojo.dto.UserDto;
import com.pojo.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : 杨世博
 * @date: Created in 23:47 2023/5/30
 */
public interface IUserService extends IService<User> {

    /**
     * 登录
     *
     * @param request
     * @param loginDto
     * @return
     */
    UserDto login(HttpServletRequest request, LoginDto loginDto);
}
