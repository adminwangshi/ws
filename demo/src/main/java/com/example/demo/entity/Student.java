package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wangshi
 * @ClassName student
 * @Description 学生实体类
 * @Date 2019/2/16 16:29
 * @Version V1.0
 */
@Data
public class Student implements Serializable {
    private String id;
    private String name;
    private String classNumber;

    public Student(String id, String name, String classNumber) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
    }

    public Student() {
    }
}
