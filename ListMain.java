package com.list.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain {
	
	public static void main(String args[]) {
//		ArrayList lst = new ArrayList();						//Heterogenous Collection
		ArrayList<String> lst = new ArrayList<String>();       //ArrayList implementing interface List & Generic Collection
		lst.add("Chennai");
		lst.add("Hyderabad");
		lst.add("Mumbai");
//		lst.add(new Integer(300)); 								//No primitve type can be added, only object
//		lst.add(400); 											//Autoboxing is done by compiler
		System.out.println(lst);
		System.out.println(lst.size());
		
//		Iterator<String> it = lst.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(int i = 0; i<lst.size(); i++) {
			System.out.println(lst.get(i));			//No additional method in set, so not for set 
		}
		
//		for(String x: lst) {
//			System.out.println(x);
//		}
	}
}
