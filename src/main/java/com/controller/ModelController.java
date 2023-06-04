package com.controller;

import com.common.Result;
import com.pojo.entity.Model;
import com.service.IModelService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : 杨世博
 * @date: Created in 10:10 2023/6/2
 */
@RestController
@RequestMapping("/model")
@Api(tags = "模型管理")
@Slf4j
public class ModelController {

    @Autowired
    IModelService modelService;

    /**
     * 上传模型
     *
     * @param model
     * @return
     */
    @PutMapping("/put")
    public Result<Boolean> put(HttpServletRequest request, @RequestBody Model model) {
        modelService.put(request, model);
        return
    }
}
