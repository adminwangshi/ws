package com.example.demo.web.controller;

import com.example.demo.entity.Student;
import org.apache.log4j.Logger;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author wangshi
 * @ClassName testController
 * @Description TODO
 * @Date 2019/2/16 17:04
 * @Version V1.0
 */
@Controller
@RequestMapping("student")
public class StudentController {
    private static Logger logger = Logger.getLogger(StudentController.class);

    public String TemplateResolution(Object obj,String templateName)throws IOException {
        String root = System.getProperty("user.dir") + File.separator + "src/main/resources/templates";
        FileResourceLoader resourceLoader = new FileResourceLoader(root, "utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate(File.separator + templateName);
        String str = t.render();
        return str;
    }

    @RequestMapping("hello")
    public String sayHello(Model model) {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("00001","张三","三年级一班");
        Student student2 = new Student("00001","历史","三年级一班");
        students.add(student);
        students.add(student2);
        model.addAttribute("list",students);
        return "HelloWorld.btl";
    }

}
