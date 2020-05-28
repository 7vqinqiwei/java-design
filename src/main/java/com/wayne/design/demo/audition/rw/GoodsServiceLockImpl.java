package com.wayne.design.demo.audition.rw;

import com.wayne.design.demo.audition.tools.SleepTools;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *@author
 *类说明：用读写锁实现商品服务接口
 */
public class GoodsServiceLockImpl implements GoodsService {

    private GoodsInfo goodsInfo;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    /**
     * //读锁
	 */
	private final Lock getLock = lock.readLock();
	/**
     * //写锁
	 */
    private final Lock setLock = lock.writeLock();

    public GoodsServiceLockImpl(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

	@Override
	public GoodsInfo getNum() {
		getLock.lock();
		try {
			SleepTools.ms(5);
			return this.goodsInfo;
		}finally {
			getLock.unlock();
		}
	}

	@Override
	public void setNum(int number) {
		setLock.lock();
		try {
			SleepTools.ms(5);
			goodsInfo.changeNumber(number);
		}finally {
			setLock.unlock();
		}

	}

}
