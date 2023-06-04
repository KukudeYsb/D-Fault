package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.entity.UserModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : 杨世博
 * @date: Created in 10:41 2023/6/2
 */
@Mapper
public interface UserModelMapper extends BaseMapper<UserModel> {
}
