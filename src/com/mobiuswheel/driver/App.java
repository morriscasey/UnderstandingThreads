package com.mobiuswheel.driver;

import com.mobiuswheel.car.CarWithThread;
import com.mobiuswheel.car.CarWithoutThread;
import com.mobiuswheel.carwithrunnable.CarWithRunnable;
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
		
		CarWithThread car3 = new CarWithThread("Car 3");
		car3.start();
		
		CarWithThread car4 = new CarWithThread("Car 4");
		car4.start();
		
		// Difference between using Thread and Runnable is that extending a class with Thread means you loose
		// the ability to extend abstract classes. Where implementing as runnable interface allows you to decouple you classes more.
		System.out.println("**** Common way to handle threads using runnable.");
		Thread car5 = new Thread(new CarWithRunnable("Car 5"));
		car5.start();
		Thread car6 = new Thread(new CarWithRunnable("Car 6"));
		car6.start();
		
	}

}
