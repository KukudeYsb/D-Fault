package com.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 杨世博
 * @date: Created in 10:33 2023/6/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    /**
     * 模型id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 模型描述
     */
    private String describe;

    /**
     * 是否公开
     */
    private Boolean isPublic;
}
