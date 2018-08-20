package com.designpatterns.creationalpatterns.singleton;

import org.w3c.dom.ranges.RangeException;

public class DbSingleton {
	
	private static volatile DbSingleton instance=null;
	
	private DbSingleton() {
		if(instance!=null) {
			throw new RuntimeException("Use getInstace() to create object");
		}
		
	}
	
	public static DbSingleton getInstace() {
		if(instance==null) {
			synchronized (DbSingleton.class) {
				if(instance==null)
					instance=new DbSingleton();
			}
		
		}
		
		return instance;
	}

}
