
package com.wayne.design.demo.spring.propogation.service;


import com.wayne.design.demo.spring.propogation.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogService {
	@Autowired
	private LogDao logDao;

//	@Transactional(propagation= Propagation.REQUIRED) //默认事务传播事件
//@Transactional(propagation=Propagation.REQUIRES_NEW)//不管调用方有没有事务 - 反正新建一个事务 | 调用有事务 则该挂起调用方事务 调用方事务异常不会回归当前方法事务
//@Transactional(propagation= Propagation.SUPPORTS)//调用方含有事务 -- 则有事务 | 无事务则已无事务运行
//@Transactional(propagation= Propagation.NOT_SUPPORTED)//以非事务方法执行，如果调用方有事务则挂起
@Transactional(propagation= Propagation.MANDATORY)//支持当前事务 | 没有事务则报异常 -- 改方法与调用方是同一个事务，执行后调用方报错会回滚
//	@Transactional(propagation=Propagation.NEVER)//以无事务方式调用 - 调用方有事务则报错
//@Transactional(propagation=Propagation.NESTED)//如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则进行与PROPAGATION_REQUIRED类似的操作。
public void addLog(){
	logDao.addLog();  //如果有一条数据
	int i =10/0;
	logDao.addLog();
}


}
