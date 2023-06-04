package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.dto.UserDto;
import com.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : 杨世博
 * @date: Created in 23:51 2023/5/30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取登录信息
     */
    UserDto selectUserDto(@Param("username") String username, @Param("phone") String phone, @Param("password") String password);
}
