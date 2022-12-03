package com.tests.service.Impl;

import com.tests.dao.StudentMapper;
import com.tests.model.Student;
import com.tests.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
//    调用Dao层
    @Resource
    private StudentMapper studentMapper;
    @Override
    public Student queryStudent(String id) {
        System.out.println("接受到service值:"+ id);
        Student student = studentMapper.selectById(id);
        return student;
    }
}
