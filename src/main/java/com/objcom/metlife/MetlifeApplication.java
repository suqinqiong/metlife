package com.objcom.metlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@EnableScheduling
@SpringBootApplication
public class MetlifeApplication{

    public static void main(String[] args) {
        SpringApplication.run(MetlifeApplication.class, args);
    }

//    //这里配置静态资源文件的路径导包都是默认的直接导入就可以
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
//        super.addResourceHandlers(registry);
//    }
}
