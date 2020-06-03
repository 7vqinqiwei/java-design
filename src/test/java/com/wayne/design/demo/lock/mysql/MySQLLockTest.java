package com.wayne.design.demo.lock.mysql;


import com.wayne.design.demo.spring.propogation.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySQLLockTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring4.xml");
		UserService userService = (UserService) app.getBean("userService");
		userService.add03();
	}

}
