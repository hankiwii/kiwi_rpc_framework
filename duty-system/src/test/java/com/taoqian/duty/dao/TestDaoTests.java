package com.taoqian.duty.dao;

import com.taoqian.duty.entity.TestDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

// SpringBoot测试类
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDaoTests {

    @Autowired
    TestDao testDao;

    @Test
    public void setTestDao() throws SQLException {
        TestDO test = testDao.test();
        Assert.notNull(test, "查询数据库，结果为空！测试出错！");
        System.out.println(test.toString());
    }
}
