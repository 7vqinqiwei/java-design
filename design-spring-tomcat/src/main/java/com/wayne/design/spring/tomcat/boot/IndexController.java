package com.wayne.design.spring.tomcat.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author
 */
@RestController
@EnableMyBean
public class IndexController {

	@Resource
	private MyBean myBean;

	@RequestMapping("/index")
	public String index() {
		myBean.method();
		return "springboot 2.0";
	}

}
