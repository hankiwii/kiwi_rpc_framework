package com.taoqian.duty.service.impl;

import com.taoqian.duty.dao.LogDao;
import com.taoqian.duty.entity.Log;
import com.taoqian.duty.entity.Result;
import com.taoqian.duty.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImpl implements LogService{
    @Autowired
    LogDao logDao;

    /**
     * 注册功能
     * @param log
     * @return
     */
    @Override
    public void regist(Log log) {
        if(logDao.findByPhone(log.getPhone())==0)
        {
            Result.of("用户已经存在");
        }
        else
        {
            logDao.regist(log);
        }
    }

    /**
     * 登录功能
     * @param
     * @return
     */
    @Override
    public void login(Log log) {
        if(logDao.login(log)==0)
        {
            Result.of("用户名或者密码错误");
        }
        else
        {
            Result.of("登录成功");
        }
    }
}
