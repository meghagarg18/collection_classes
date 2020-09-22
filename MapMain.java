package com.map.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String args[]) {
		
		Map<Integer,String> m = new HashMap<>();
		
		m.put(1,"Delhi");
		m.put(1,"Hyderabad"); 
		m.put(3,"Chennai");
		m.put(4,"Mumbai");
		m.put(5,"Delhi");
		System.out.println(m);

		String city = m.get(1);
		if(city==null)
			System.out.println("City not found");
		else 
			System.out.println(city);
	}
}
