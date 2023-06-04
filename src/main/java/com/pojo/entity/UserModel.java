package com.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : 杨世博
 * @date: Created in 10:13 2023/6/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 模型id
     */
    private Long modelId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;
}
