package com.wayne.design.demo.audition.map;

/**
 *@author
 *类说明：简单的程序会有线程安全问题吗？
 */
public class SimpleOperator {

    /**
     * 累加计数器
     */
    private long count =0;

    /**
     * count进行累加
     */
    public synchronized void incCount(){
        count++;
    }

    /**
     * 增加count线程
     */
    private static class Count extends Thread {

        private SimpleOperator simpleOperator;

        public Count(SimpleOperator simpleOperator) {
            this.simpleOperator = simpleOperator;
        }

        @Override
        public void run() {
            for(int i=0;i<10000;i++){
                simpleOperator.incCount();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleOperator simpleOperator = new SimpleOperator();
        //启动两个线程
        Count count1 = new Count(simpleOperator);
        Count count2 = new Count(simpleOperator);
        count1.start();
        count2.start();
        Thread.sleep(5);
        System.out.println(simpleOperator.count);
    }

}
