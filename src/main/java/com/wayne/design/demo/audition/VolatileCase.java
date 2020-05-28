package com.wayne.design.demo.audition;

import com.wayne.design.demo.audition.tools.SleepTools;

import java.util.Random;

/**
 *
 *@author
 *类说明：
 */
public class VolatileCase {

    private static volatile int a = 0;

    /**
     * 读取线程
     */
	private static class VolatileVar implements Runnable {

	    @Override
	    public void run() {
            while(true){
                SleepTools.ms(500);
                System.out.println(Thread.currentThread().getName()
                        + ":----" + a);
            }
	    }
	}

    public static void main(String[] args) {
        VolatileVar volatileVar = new VolatileVar();
        Random r = new Random();

        Thread t1 = new Thread(volatileVar);
        Thread t2 = new Thread(volatileVar);
        Thread t3 = new Thread(volatileVar);
        Thread t4 = new Thread(volatileVar);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        SleepTools.ms(100);
        while(true){
            SleepTools.ms(399);
            System.out.println(Thread.currentThread().getName()
                    + ":----" + (a = a+r.nextInt(100)));
        }
    }

}
