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
public class MyThreadTest {

	@Test
    public void threadTest() {
		MyThread myThread = new MyThread();
		myThread.start();
		int MAX_VALUE = 10;
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println("MyThreadTest线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}
}