package com.designpatterns.creationalpatterns.singleton;

public class DbSingleton {
	
	private static DbSingleton instance=new DbSingleton();
	
	private DbSingleton() {
		
	}
	
	public static DbSingleton getInstace() {
		return instance;
	}

}
