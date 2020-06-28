package com.wayne.design.tomcat.reverse.controller;


import com.wayne.design.tomcat.reverse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
	public String index() {
		// return "纯手写SpringBoot ok啦！！！";\
		return userService.index();
	}

}
