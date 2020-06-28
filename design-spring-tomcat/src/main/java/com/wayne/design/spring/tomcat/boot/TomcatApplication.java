package com.wayne.design.spring.tomcat.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author
 * 使用springboot启动tomcat
 *
 */
@SpringBootApplication
public class TomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomcatApplication.class, args);
    }
}
