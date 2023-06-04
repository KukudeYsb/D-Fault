package com.controller;

import com.common.Result;
import com.constants.ResultCode;
import com.pojo.dto.LoginDto;
import com.pojo.dto.UserDto;
import com.service.IUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户接口
 *
 * @author : 杨世博
 * @date: Created in 23:55 2023/5/30
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public Result<UserDto> login(HttpServletResponse response, HttpServletRequest request, @RequestBody LoginDto loginDto) {
        UserDto userDto = userService.login(request, loginDto);
        return Result.judge(userDto != null, userDto, ResultCode.USER_CREDENTIALS_ERROR);
    }
}
