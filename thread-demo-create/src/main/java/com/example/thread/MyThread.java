package com.example.thread;

/**
 * @author eddie.lee
 * @ProjectName thread-demo
 * @Package com.example.thread
 * @ClassName MyThread
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-03-20 18:35
 * @modified by
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		int maxvalue = 10;
		for (int i = 0; i < maxvalue; i++) {
			System.out.println("MyThread线程正在执行：" + currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}
}
