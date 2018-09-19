package com.app.newfeatures8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorTest {

	public static void main(String[] args) {
		
		List<Developer> list=Developer.getDevelopers();
		System.out.println("before sort");
		for(Developer d:list)
			System.out.println(d);
		
		//sorting without lambda
		
		/*
		list.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("after sort");
		for(Developer d:list)
			System.out.println(d);*/
		
		

		//sorting with lambda
		Comparator<Developer> byName = 
				(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
				
		//list.sort(byName);
				
		//list.sort((Developer o1,Developer o2)->o1.getName().compareTo(o2.getName()));
		list.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		System.out.println("after sort");
		for(Developer d:list)
			System.out.println(d);
		
		//java 8 only, lambda also, to print the List
		System.out.println("print by using java 8 forEach");
		list.forEach((d)->System.out.println(d));
		
		//lambda, valid, parameter type is optional sorting based on age
		list.sort((o1, o2)->o1.getAge()-o2.getAge());
		System.out.println("sorting based  on age:");
		list.forEach((d)->System.out.println(d));
			
	}

}
