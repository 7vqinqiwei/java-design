package com.wayne.design.demo.proxy.cglib;


import com.wayne.design.demo.proxy.User;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * @author
 */
public class UserServiceInterceptor implements MethodInterceptor {

	private static Logger logger = Logger.getLogger(UserServiceInterceptor.class.getName());
	@Override
	public Object intercept(Object obj, Method method, Object[] args,MethodProxy proxy) throws Throwable {
		if(args!=null && args.length>0 && args[0] instanceof User){
			User user = (User) args[0];
			if(user.getName().trim().length() <= 1){
				throw new RuntimeException("用户姓名输入长度需要大于1！");
			}
		}
		Object ret = proxy.invokeSuper(obj, args);
		logger.info("数据库操作成功！");
		return ret;
	}
}
