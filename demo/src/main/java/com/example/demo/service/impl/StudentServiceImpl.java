package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangshi
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Date 2019/2/18 9:51
 * @Version V1.0
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> getStudentInfo(){
        return studentMapper.findStudentInfo();
    }
    public void insert(Student student){
        int i = studentMapper.addStudentInfo(student);
        if(i>0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

}
