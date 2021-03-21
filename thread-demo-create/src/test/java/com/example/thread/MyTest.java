package com.example.thread;

import org.junit.Test;

/**
 * @author eddie.lee
 * @ProjectName thread-demo
 * @Package com.example.thread
 * @ClassName MyThreadTest
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-03-20 23:20
 * @modified by
 */
public class MyTest {

	@Test
    public void threadTest() {
		MyThread myThread = new MyThread();
		myThread.start();
		int MAX_VALUE = 10;
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println("threadTest-线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}

	@Test
	public void runnableTest() {
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		int MAX_VALUE = 10;
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println("runnableTest-线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}
}