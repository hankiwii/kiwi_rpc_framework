package com.taoqian.duty.dao;

import com.taoqian.duty.entity.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentsServiceTest {
    /**
     *
     */
    @Autowired
    StudentsDao studentsDao;

    @Test
    public void insertStudentsDao() {
        Students student = new Students(5, "陶倩", 1, "13438331557");;
        int s = studentsDao.insert(student);
        System.out.println(s);
    }

    @Test
    public void findStudentsDao() {
        Students s = studentsDao.find(2);
        System.out.println(s);
    }

    @Test
    public void updateStudentsDao() {
        Students student = new Students(5, "陶倩", 1, "13438331557");
        int s = studentsDao.update(student);
        System.out.println(s);
    }

    @Test
    public void deleteStudentsDao() {
        int s = studentsDao.delete(5);
        System.out.println(s);
    }
}
