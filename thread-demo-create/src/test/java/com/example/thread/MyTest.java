package com.example.thread;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

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
		myThread.setName("threadTest");
		myThread.start();
		int MAX_VALUE = 10;
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println(
					"threadTest-线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}

	@Test
	public void runnableTest() {
		Thread thread = new Thread(new MyRunnable(),"runnableTest");
		thread.start();
		int MAX_VALUE = 10;
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println(
					"runnableTest-线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}

	@Test
	public void callableTest() throws ExecutionException, InterruptedException {
		FutureTask<String> futureTask = new FutureTask<String>(new MyCallable());
		Thread thread = new Thread(futureTask, "callableTest");
		thread.start();
		int MAX_VALUE = 10;
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println("callableTest-主线程正在执行：" + Thread.currentThread().getName() + " , 时间："
					+ System.currentTimeMillis() + " , 循环次数：" + i);
		}
		System.out.println(futureTask.get());
	}
}