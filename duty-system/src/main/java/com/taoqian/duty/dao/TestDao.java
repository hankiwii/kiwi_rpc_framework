package com.taoqian.duty.dao;

import com.taoqian.duty.entity.TestDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Mapper注解， 定义了数据库接口层，这个接口中的方法名要与resouces/config/mapper/文件夹下的mapper.xml文件
 * 中的sql语句的“id”要相同，调用了这个接口类的方法，就相当于调用了mapper文件中的SQL语句
 */
@Mapper
public interface TestDao {
    TestDO test();
}
