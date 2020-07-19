package com.taoqian.duty.dao;

import com.taoqian.duty.entity.Log;

public interface LogDao {
    int findByPhone(String phone);

    int regist(Log log);

    int login(Log log);
}
