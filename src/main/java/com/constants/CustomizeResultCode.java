package com.constants;

/**
 * 自定义返回码
 *
 * @author : 杨世博
 * @date: Created in 23:55 2023/5/30
 */
public interface CustomizeResultCode {
    /**
     * 获取错误码
     *
     * @return 错误码
     */
    Integer getCode();

    /**
     * 获取错误信息
     *
     * @return 错误信息
     */
    String getMessage();
}
