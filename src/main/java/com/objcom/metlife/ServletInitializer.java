package com.objcom.metlife;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.*;

/**
 * 执行打包操作
 * 拷贝到Tomcat的webapp下，启动Tomcat访问即可
 * 因为访问地址不再是根目录了，所有路径中需要加入项目名称：
 * http://localhost:8080/ springboot_jpa-0.0.1-SNAPSHOT/user/findAll
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(MetlifeApplication.class);
    }

//    public static void main(String[] args) {
//        Vector vector = new Vector();
//        Collection collection = new ArrayList<>();
//        Map map = new HashMap();
//        Iterator iterator = (Iterator) new ArrayList<>();
//        Iterable iterable = new ArrayList();
//        List list = new ArrayList();
//        Set set = new HashSet();
//    }

}
