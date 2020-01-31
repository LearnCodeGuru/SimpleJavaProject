package com.learn;

public class WokerThread extends Thread {

	private String name;
	private int duration;

	public WokerThread(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(duration * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " exiting....");
	}
}
