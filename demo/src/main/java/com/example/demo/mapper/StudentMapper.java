package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<Student> findStudentInfo();
    public int addStudentInfo(Student student);
    public int delStudentInfo(int id);
}
