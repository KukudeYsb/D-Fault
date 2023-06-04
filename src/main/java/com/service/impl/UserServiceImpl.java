package com.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pojo.dto.LoginDto;
import com.pojo.dto.UserDto;
import com.pojo.entity.User;
import com.mapper.UserMapper;
import com.service.IUserService;
import com.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : 杨世博
 * @date: Created in 23:51 2023/5/30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDto login(HttpServletRequest request, LoginDto loginDto) {
        QueryWrapper<Object> qw = new QueryWrapper<>();
        qw.eq("username", loginDto.getUsername()).or().eq("phone", loginDto.getPhone());
        UserDto userDto = userMapper.selectUserDto(loginDto.getUsername(), loginDto.getPhone(), loginDto.getPassword());

        if (userDto != null) {
            String token = JwtUtils.getToken(userDto.getUsername());
            request.getSession().setAttribute("token", token);
        }

        return userDto;
    }
}
