package com.tests.dao;

import com.tests.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);

    Student selectById(String id);
}