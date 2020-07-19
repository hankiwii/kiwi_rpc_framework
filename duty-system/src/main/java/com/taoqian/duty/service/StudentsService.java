package com.taoqian.duty.service;

import com.taoqian.duty.entity.Result;
import com.taoqian.duty.entity.Students;
import org.apache.ibatis.annotations.Mapper;

public interface StudentsService {
    Result insert(Students student);

    Result find(int studentId);

    Result update(Students student);

    Result delete(int studentId);
}
