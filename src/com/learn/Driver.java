package com.learn;

public class Driver {

	public static void main(String[] args) {
		System.out.println("START TESTING");
		WokerThread thread1 = new WokerThread("Slowest", 15);
		WokerThread thread2 = new WokerThread("Slow", 10);
		WokerThread thread3 = new WokerThread("Fast", 5);

		thread1.start();
		thread2.start();
		thread3.start();

		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("END TESTING");
	}
}
