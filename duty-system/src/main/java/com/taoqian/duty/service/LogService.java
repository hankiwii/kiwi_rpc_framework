package com.taoqian.duty.service;
import com.taoqian.duty.entity.Log;
import com.taoqian.duty.entity.Result;

public interface LogService {


    /**
     * 注册
     */

    void regist(Log log);

    /**
     * 登录
     */
    void login(Log log);
}
