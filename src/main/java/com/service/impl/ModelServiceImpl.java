package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mapper.ModelMapper;
import com.pojo.entity.Model;
import com.service.IModelService;
import org.springframework.stereotype.Service;

/**
 * @author : 杨世博
 * @date: Created in 18:13 2023/6/2
 */
@Service
public class ModelServiceImpl extends ServiceImpl<ModelMapper, Model> implements IModelService {
}
