package com.mobiuswheel.car;

public class CarWithoutThread implements Car{
	private String name;
	
	public CarWithoutThread(String name) {
		this.name = name;
		
	}

	public void run(){
		for(int i = 0; i <= 10; i++){
			System.out.println(name + " moved " + i + " spaces!");
		}
	}

	@Override
	public void start() {
		this.run();
		
	}
}
