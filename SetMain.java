package com.set.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>(); //Unsorted & Unordered
		set.add("Chennai");
		set.add("Hyd");
		System.out.println(set.add("Chennai"));
		set.add("Delhi");
		System.out.println(set.size());
		
		for(String x: set) {
			System.out.println(x);
		}
	}
}
