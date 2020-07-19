package com.taoqian.duty.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

// 这个@Data注解，就相当于写了get  set  toString，hashCode方法
@Data
public class TestDO {
    String id;
    String name;
    // 返回结果时，会帮我们把时间类型，转换为东八区时间的指定格式“yyyy-MM-dd HH:mm:ss”的字符串
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    LocalDateTime time;
}
