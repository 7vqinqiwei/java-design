package com.wayne.design.demo.audition.rw;


import com.wayne.design.demo.audition.tools.SleepTools;

/**
 *@author
 *类说明：用内置锁来实现商品服务接口
 */
public class GoodsServiceSynImpl implements GoodsService {

	private GoodsInfo goodsInfo;

	public GoodsServiceSynImpl(GoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	@Override
	public synchronized GoodsInfo getNum() {
		SleepTools.ms(5);
		return this.goodsInfo;
	}

	@Override
	public synchronized void setNum(int number) {
		SleepTools.ms(5);
		goodsInfo.changeNumber(number);

	}

}
