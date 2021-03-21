package com.example.thread;

/**
 * @author eddie.lee
 * @ProjectName thread-demo
 * @Package com.example.thread
 * @ClassName MyRunable
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-03-20 23:47
 * @modified by
 */
public class MyRunnable implements Runnable {

	public void run() {
		int maxvalue = 10;
		for (int i = 0; i < maxvalue; i++) {
			System.out.println("MyRunnable线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}
}
