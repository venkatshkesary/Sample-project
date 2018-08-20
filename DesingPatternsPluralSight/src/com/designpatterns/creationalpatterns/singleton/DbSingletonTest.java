package com.designpatterns.creationalpatterns.singleton;

public class DbSingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DbSingleton instace=DbSingleton.getInstace();
		DbSingleton instace2=DbSingleton.getInstace();
		
		System.out.println(instace2);
		System.out.println(instace);
	}

}
