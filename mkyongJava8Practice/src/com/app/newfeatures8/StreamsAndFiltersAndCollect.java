package com.app.newfeatures8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndFiltersAndCollect {

	public static void main(String[] args) {
	
		//Before Java 8, filter a List like this :
		
		List<String> list=Arrays.asList("abc","abde","abc","sjfksdfj","abcd","sjfsdfj");
		List<String> result=getFilteredOutput(list,"abc");
		for(String s:result) {
			System.out.println(s);
		}
		System.out.println();
		
		//The equivalent example in Java 8, stream.filter() to filter a List, and collect() to convert a stream into a List.
		
		List<String> res=list.stream().filter(s->s.equals("abc")).collect(Collectors.toList());
		res.forEach(s->System.out.println(s));

	}

	private static List<String> getFilteredOutput(List<String> list, String string) {
		List<String> res=new ArrayList<>();
		for(String s:list) {
			if(s.equals(string)) {
				res.add(s);
			}
		}
		
		return res;
	}

}
