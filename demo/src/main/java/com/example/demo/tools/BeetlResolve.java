package com.example.demo.tools;

import org.apache.log4j.Logger;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @Author wangshi
 * @ClassName BeetlResolve
 * @Description TODO
 * @Date 2019/4/9 11:09
 * @Version V1.0
 */
public class BeetlResolve {

    private static Logger logger = Logger.getLogger(BeetlResolve.class);

    public String TemplateResolution(Object obj,String templateName)throws IOException{
        String root = System.getProperty("user.dir")+File.separator+"src/main/resources/templates";
        FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate(File.separator+templateName);
//        t.binding();
        String str = t.render();
        logger.info(templateName+"模板内容"+str);
        return str;
    }
}
