package com.taoqian.duty.service.impl;

import com.taoqian.duty.constant.ResultCodeConst;
import com.taoqian.duty.dao.StudentsDao;
import com.taoqian.duty.entity.Result;
import com.taoqian.duty.entity.Students;
import com.taoqian.duty.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService{
    @Autowired
    StudentsDao studentsDao;

    @Override
    public Result insert(Students student) {
        int students = studentsDao.insert(student);
        return Result.of(students);
    }

    @Override
    public Result find(int studentId) {
        Students students = studentsDao.find(studentId);
        return Result.of(students);
    }

    @Override
    public Result update(Students student) {
        int students = studentsDao.update(student);
        return Result.of(students);
    }

    @Override
    public Result delete(int studentsId) {
        int students = studentsDao.delete(studentsId);
        return Result.of(students);
    }
}
