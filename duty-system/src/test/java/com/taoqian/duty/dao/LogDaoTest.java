package com.taoqian.duty.dao;

import com.taoqian.duty.entity.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LogDaoTest {
    /**
     *
     */
    @Autowired
    LogDao logDao;

    @Test
    public void findByPhone() {
        int byPhone = logDao.findByPhone("13438331557");
        System.out.println(byPhone);
    }
}
