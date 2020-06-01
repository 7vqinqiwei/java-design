package com.wayne.design.demo.proxy.cglib;

import com.wayne.design.demo.proxy.User;

/**
 * @author
 * 实现与jdk动态代理是一样的 -- 但是当前实现无需实现接口也是可以的
 */
public class UserServiceImpl {

	/**
	 * cglib不能代理final方法和类
	 * @param user
	 */
	public void addUser(User user) {
		System.out.println("用户数据入库成功，数据为："+user.toString());
	}

}
