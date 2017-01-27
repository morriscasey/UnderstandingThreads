package com.mobiuswheel.driver;

import com.mobiuswheel.car.CarWithThread;
import com.mobiuswheel.car.CarWithoutThread;
/**
 * Example showing how run cycle works with and without thread. By using a thread then run() method starts
 * simultaneously.
 * 
 * @author Casey Morris
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("*** Without Threading");
		CarWithoutThread car1 = new CarWithoutThread("Car 1");
		car1.start();
		
		CarWithoutThread car2 = new CarWithoutThread("Car 2");
		car2.start();
		
		System.out.println("*** With Threading ***");
		
		CarWithThread car3 = new CarWithThread("Car 1");
		car3.start();
		
		CarWithThread car4 = new CarWithThread("Car 2");
		car4.start();
		
	}

}
