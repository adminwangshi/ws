package com.example.demo.blh;/**
 * Created by Administrator on 2019/2/18.
 */

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author wangshi
 * @ClassName StudentBlh
 * @Description TODO
 * @Date 2019/2/18 9:55
 * @Version V1.0
 */
@Component
public class StudentBlh {
    @Autowired
    private StudentService studentService;
    public List<Student> findStudentInfo(){
        return studentService.getStudentInfo();
    }
    @Transactional
    //注解开启事务，异常回滚
    public void addStudent(Student student){
        studentService.insert(student);
    }

}
