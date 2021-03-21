[TOC]

# 目录

## （一）线程创建

### 1.1 线程创建-继承thread类

#### 1.1.1 创建自定义线程类

```java
public class MyThread extends Thread {

	private Integer MAX_VALUE = 10;

	@Override
	public void run() {
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println("MyThread线程正在执行：" + currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}
}
```

#### 1.1.2 单元测试
```java
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
```

#### 1.1.3 Console
```text
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThread线程正在执行：Thread-0 , 时间：1616254510778
MyThreadTest线程正在执行：main , 时间：1616254510778
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThreadTest线程正在执行：main , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThreadTest线程正在执行：main , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
MyThread线程正在执行：Thread-0 , 时间：1616254510779
Disconnected from the target VM, address: '127.0.0.1:56459', transport: 'socket'

Process finished with exit code 0
```

### 1.2 线程创建-实现Runnable接口

#### 1.2.1 创建自定义类实现Runnable接口
```java
public class MyRunnable implements Runnable {

	public void run() {
		int maxvalue = 10;
		for (int i = 0; i < maxvalue; i++) {
			System.out.println("MyRunnable线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
		}
	}
}
```

#### 1.2.2 单元测试
```java
@Test
public void runnableTest() {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
    int MAX_VALUE = 10;
    for (int i = 0; i < MAX_VALUE; i++) {
        System.out.println("runnableTest-线程正在执行：" + Thread.currentThread().getName() + " , 时间：" + System.currentTimeMillis());
    }
}
```

#### 1.2.3 Console
```text
Connected to the target VM, address: '127.0.0.1:58211', transport: 'socket'
runnableTest-线程正在执行：main , 时间：1616302606499
runnableTest-线程正在执行：main , 时间：1616302606499
runnableTest-线程正在执行：main , 时间：1616302606499
runnableTest-线程正在执行：main , 时间：1616302606499
MyRunnable线程正在执行：Thread-0 , 时间：1616302606499
runnableTest-线程正在执行：main , 时间：1616302606499
MyRunnable线程正在执行：Thread-0 , 时间：1616302606499
runnableTest-线程正在执行：main , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
runnableTest-线程正在执行：main , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
runnableTest-线程正在执行：main , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
runnableTest-线程正在执行：main , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
runnableTest-线程正在执行：main , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
MyRunnable线程正在执行：Thread-0 , 时间：1616302606500
Disconnected from the target VM, address: '127.0.0.1:58211', transport: 'socket'
```