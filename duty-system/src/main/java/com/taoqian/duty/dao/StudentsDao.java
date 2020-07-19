package com.taoqian.duty.dao;

import com.taoqian.duty.entity.Students;
import org.apache.ibatis.annotations.Mapper;

/**
 * 持久层实现student类的增删改查
 */
// Mapper：
@Mapper
public interface StudentsDao {

    /**
     * 插入数据
     * @param student
     * @return
     */
    int insert(Students student);

    /**
     * 查找数据
     * @param studentId
     * @return
     */
    Students find(int studentId);

    /**
     * 更新数据
     * @param students
     * @return
     */
    int update(Students students);

    /**
     * 删除数据
     * @param studentsId
     * @return
     */
    int delete(int studentsId);
}
