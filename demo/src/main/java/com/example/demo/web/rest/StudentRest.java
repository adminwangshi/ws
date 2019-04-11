package com.example.demo.web.rest;

import com.example.demo.blh.StudentBlh;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author wangshi
 * @ClassName testController
 * @Description TODO
 * @Date 2019/2/16 17:04
 * @Version V1.0
 */
@RestController
@RequestMapping("/student")
public class StudentRest {

    @Autowired
    private StudentBlh studentBlh;
    @RequestMapping("/findStudentInfo")
    void findStudentInfo() {
        List<Student> studentInfo = studentBlh.findStudentInfo();
        System.out.println("学生集合："+studentInfo.toString());
    }
    
    @RequestMapping("/addStudent")
    void addStudent() {
        Student student = new Student();
        student.setId("1111");
        student.setClassNumber("三年级一班");
        student.setName("张三");
        studentBlh.addStudent(student);
    }
}
