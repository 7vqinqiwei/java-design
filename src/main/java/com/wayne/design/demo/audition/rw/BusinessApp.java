package com.wayne.design.demo.audition.rw;


import com.wayne.design.demo.audition.tools.SleepTools;

import java.util.Random;

/**
 *@author
 *类说明：对商品进行业务的应用
 */
public class BusinessApp {
    /**
     * 读写线程的比例
     */
    static final int readWriteRatio = 10;
    /**
     * 最少线程数
     */
    static final int minThreadCount = 3;
    /**
     * 读操作
     */
    private static class GetThread implements Runnable {
        private GoodsService goodsService;
        public GetThread(GoodsService goodsService) {
            this.goodsService = goodsService;
        }
        @Override
        public void run() {
            long start = System.currentTimeMillis();
            for(int i=0;i<100;i++){
                //读取100次
                goodsService.getNum();
//                System.out.println(Thread.currentThread().getName() + "读取的数据是+" + goodsService.getNum());
            }
            System.out.println(Thread.currentThread().getName()+"读取商品数据耗时：" +(System.currentTimeMillis()-start)+"ms");
        }
    }

    /**
     * 写操做
     */
    private static class SetThread implements Runnable {
        private GoodsService goodsService;
        public SetThread(GoodsService goodsService) {
            this.goodsService = goodsService;
        }
        @Override
        public void run() {
            long start = System.currentTimeMillis();
            Random r = new Random();
            for(int i=0;i<10;i++){
                //写操作10次
            	SleepTools.ms(50);
                goodsService.setNum(r.nextInt(10));
            }
            System.out.println(Thread.currentThread().getName() +"写商品数据耗时："+(System.currentTimeMillis()-start)+"ms---------");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        GoodsInfo goodsInfo =
                new GoodsInfo("Cup",100000,10000);
//        GoodsService goodsService = new GoodsServiceSynImpl(goodsInfo);
        GoodsService goodsService = new GoodsServiceLockImpl(goodsInfo);
        for(int i = 0; i< minThreadCount; i++){
            Thread setT = new Thread(new SetThread(goodsService));
            for(int j=0;j<readWriteRatio;j++) {
                Thread getT = new Thread(new GetThread(goodsService));
                getT.start();
            }
            SleepTools.ms(100);
            setT.start();
        }

    }
}
