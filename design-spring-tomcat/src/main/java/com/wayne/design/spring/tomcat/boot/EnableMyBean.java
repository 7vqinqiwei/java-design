package com.wayne.design.spring.tomcat.boot;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({MyBean.class})
public @interface EnableMyBean {

}
