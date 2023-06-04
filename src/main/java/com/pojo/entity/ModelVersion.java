package com.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : 杨世博
 * @date: Created in 10:42 2023/6/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelVersion {

    /**
     * 模型版本 ——id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 模型描述
     */
    private String describe;

    /**
     * 模型id
     */
    private Long modelId;

    /**
     * 该版本创建时间
     */
    private Date gmtCreate;

    /**
     * 版本号
     */
    private Integer versionNumber;
}
