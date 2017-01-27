package com.mobiuswheel.car;

public class CarWithThread extends Thread implements Car {
	
	private String name;
	
	public CarWithThread(String name) {
		this.name = name;
		
	}

	@Override
	public void run() {
	
		for(int i = 0; i <= 10; i++){
			System.out.println(name + " moved " + i + " spaces!");
			try {
				// Used to make it easier to see thread execution by delaying the process a little.
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	

}
