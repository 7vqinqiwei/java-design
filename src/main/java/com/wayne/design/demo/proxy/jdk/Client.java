package com.wayne.design.demo.proxy.jdk;


import com.wayne.design.demo.proxy.User;

import java.lang.reflect.Proxy;

/**
 * @author
 * JDK 动态代理
 */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		user.setAddress("地址");
		user.setAge(20);
		//ison
		user.setName("1ison");

		//运行时传递过来需要实现的service
		UserService us = new UserServiceImpl();
		System.out.println(us.hashCode());

		//想象Proxy 是所有代理类的父类
		UserService proxy = (UserService) Proxy.newProxyInstance(us.getClass().getClassLoader(),us.getClass().getInterfaces(),(object,method,params) -> {
			if(params!=null && params.length>0 && params[0] instanceof User){
				User temp = (User) params[0];
				if(temp.getName().trim().length()<=1){
					throw new RuntimeException("用户姓名输入长度需要大于1！");
				}
			}
			Object ret = method.invoke(us, params);
			return ret;
		}) ;

		proxy.addUser(user);
//		System.out.println("---------------------");
//		System.out.println(proxy.hashCode());
	}
}
