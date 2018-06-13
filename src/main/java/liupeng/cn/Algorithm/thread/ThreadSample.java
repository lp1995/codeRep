package liupeng.cn.Algorithm.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Human {
	public static int a = 100;

	public static void print() throws InterruptedException {
		for (int i = 0; i < 50; i++) {
			a += 1;
			System.out.println(Thread.currentThread() + " : " + a);
		}
	}
}

public class ThreadSample {
	public static void main(String... arg) {
		Thread th = new Thread() {
			@Override
			public void run() {
				try {
					Human.print();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		Thread th2 = new Thread() {
			@Override
			public void run() {
				try {
					Human.print();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		th.start();
		th2.start();
	}
}
