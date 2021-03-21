package com.example.thread;

import java.util.concurrent.Callable;

/**
 * @author eddie.lee
 * @ProjectName thread-demo
 * @Package com.example.thread
 * @ClassName MyCallable
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-03-21 13:02
 * @modified by
 */
public class MyCallable implements Callable<String> {

	public String call() throws Exception {
		int maxvalue = 10;
		for (int i = 0; i < maxvalue; i++) {
			System.out.println(
					"MyCallable线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis()
            );

		}
		return "MyCallable Finished！";
	}

}
