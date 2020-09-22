package com.set.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(); //Sorted & Unordered
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
