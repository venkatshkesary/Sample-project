package com.designpatterns.creationalpatterns.singleton;

public class DbSingleton {
	
	private static DbSingleton instance=null;
	
	private DbSingleton() {
		
	}
	
	public static DbSingleton getInstace() {
		if(instance==null)
			instance=new DbSingleton();
		
		return instance;
	}

}
