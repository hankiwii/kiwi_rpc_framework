package com.taoqian.duty.entity;

import com.taoqian.duty.constant.ResultCodeConst;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一响应返回类
 * 通过工厂方法success和of，创建实例对象，而不是通过构造方法
 */
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    private Result(T data) {
        this.code = ResultCodeConst.RESPONSE_SUCCESS_CODE;
        this.msg = ResultCodeConst.RESPONSE_SUCCESS_MSG;
        this.data = data;
    }

    public static <K> Result<K> success() {
        return new Result<K>(ResultCodeConst.RESPONSE_SUCCESS_CODE, ResultCodeConst.RESPONSE_SUCCESS_MSG, null);
    }

    public static <K> Result<K> of(int code, String msg, K data) {
        return new Result<K>(code, msg, data);
    }

    public static Result<Object> of(int code, String msg) {
        return new Result<Object>(code, msg, null);
    }

    public static <K> Result<K> of(K data) {
        return new Result<K>(data);
    }
}
