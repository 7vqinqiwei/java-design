package com.wayne.design.demo.proxy.cglib;

import com.wayne.design.demo.proxy.User;
import org.springframework.cglib.proxy.Enhancer;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		user.setAddress("地址");
		user.setAge(20);
		user.setName("lison");


		Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
		UserServiceInterceptor interceptor = new UserServiceInterceptor();
        enhancer.setCallback(interceptor);
		System.out.println(interceptor.hashCode());

        UserServiceImpl usi1 = (UserServiceImpl) enhancer.create();
		System.out.println(usi1.hashCode());
        usi1.addUser(user);

//		System.out.println("---------------------");
//		System.out.println(usi.hashCode());

//        UserServiceImpl us = new UserServiceImpl();
//        enhancer.setCallback(new UserServiceDelegateInterceptor(us));
//        UserServiceImpl usi2 = (UserServiceImpl) enhancer.create();
//        usi2.addUser(user);
	}

}
