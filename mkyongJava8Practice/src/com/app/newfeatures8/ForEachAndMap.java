package com.app.newfeatures8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachAndMap {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		//normal way to loop a map
		for(Map.Entry<String, Integer> entry:items.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println();
		//by using java 8 forEach
		items.forEach((k,v)->System.out.println(k+" "+v));
		
		//forEach and list
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println();
		//normal way to loop
		
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println();
		//In Java 8, you can loop a List with forEach + lambda expression or method reference.
		
		//list.forEach((s)->System.out.println(s));
		list.forEach(s->System.out.println(s));
		System.out.println();
		//method reference
		//Output : A,B,C,D,E
		list.forEach(System.out::println);
		System.out.println();
		//Stream and filter
		//Output : B
		list.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);


	}

}
