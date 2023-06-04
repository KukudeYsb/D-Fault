package com.common;

import com.constants.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回类
 *
 * @author : 杨世博
 * @date: Created in 23:55 2023/5/30
 */
public class Result<T> implements Serializable {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private T data;

    public Result() {
    }

    public Result(boolean success) {
        this.success = success;
        this.code = success ? ResultCode.SUCCESS.getCode() : ResultCode.ERROR.getCode();
        this.message = success ? ResultCode.SUCCESS.getMessage() : ResultCode.ERROR.getMessage();
    }

    public Result(boolean success, ResultCode resultCode) {
        this.success = success;
        this.code = success ? ResultCode.SUCCESS.getCode() : (resultCode != null ? resultCode.getCode() : ResultCode.ERROR.getCode());
        this.message = success ? ResultCode.SUCCESS.getMessage() : (resultCode != null ? resultCode.getMessage() : ResultCode.ERROR.getMessage());
    }

    public Result(boolean success, T data) {
        this.success = success;
        this.code = success ? ResultCode.SUCCESS.getCode() : ResultCode.COMMON_FAIL.getCode();
        this.message = success ? ResultCode.SUCCESS.getMessage() : ResultCode.COMMON_FAIL.getMessage();
        this.data = data;
    }

    public Result(boolean success, ResultCode resultCode, T data) {
        this.success = success;
        this.code = success ? ResultCode.SUCCESS.getCode() : (resultCode != null ? resultCode.getCode() : ResultCode.ERROR.getCode());
        this.message = success ? ResultCode.SUCCESS.getMessage() : (resultCode != null ? resultCode.getMessage() : ResultCode.ERROR.getMessage());
        this.data = data;
    }

    /**
     * 当判断条件的结果为false时，返回resultCode中的返回信息
     *
     * @param success    判断条件
     * @param resultCode 返回信息
     */
    public static <T> Result<T> judge(boolean success, T date, ResultCode resultCode) {
        return new Result<>(success, resultCode, date);
    }

    /**
     * 返回成功
     */
    public static <T> Result<T> success() {
        return new Result<>(true);
    }

    /**
     * 返回成功，并携带数据
     */
    public static <T> Result<T> success(T date) {
        return new Result<>(true, date);
    }

    /**
     * 返回失败，并携带返回信息
     *
     * @param resultCode 返回信息
     */
    public static <T> Result<T> fail(ResultCode resultCode) {
        return new Result<>(false, resultCode);
    }

    /**
     * 返回失败，并携带返回信息和数据
     *
     * @param resultCode 返回信息
     */
    public static <T> Result<T> fail(ResultCode resultCode, T date) {
        return new Result<>(false, resultCode, date);
    }
}
