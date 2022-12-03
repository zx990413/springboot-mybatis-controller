package com.tests.controller;

import com.tests.model.Student;
import com.tests.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

//    调用service
    @Resource
    private StudentService service;
    @RequestMapping("/uui")
    @ResponseBody
    public String queryStudentById(String id){
        Student student = service.queryStudent(id);
        return  student.toString();
    }
}
