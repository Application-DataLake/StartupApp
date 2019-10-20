package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	public static void main(String [] args) {
		
		Runnable hellos = () -> {
			for (int i = 0 ; i<10; i++) {
				System.out.println("Hello "+i);
			}
		};
		Runnable goodbyess = () -> {
			for (int i = 0 ; i<10; i++) {
				System.out.println("Good bye "+i);
			}
		};
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(hellos);
		executorService.execute(goodbyess);
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}
