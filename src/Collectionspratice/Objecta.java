package Collectionspratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Objecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] abc = { 11, 22, 77, 33, 44 };
		System.out.println(abc);

		int temp = abc[2];
		abc[2] = abc[0];
		abc[0] = temp;
		
		

		System.out.println(abc);
		HashMap<Object, Object> g = new HashMap<>();

		g.put("karshak", 2);
		g.put("karshak", 8);
		g.put(1, "jj");

		g.put(true, true);
		g.put(5.8, 2);

		g.put("karthik", "karshak");

		Set<Object> k = g.keySet();
		Iterator<Object> ie = k.iterator();

		while (ie.hasNext()) {

			Object key = ie.next();

			System.out.println("key is" + key + "value is" + g.get(key));
		}

//		int i=2;
//		System.out.println(i);
//		Integer ba = new Integer(i);
//		System.out.println(ba);
//		int h=ba;

//		ArrayList<String> a = new ArrayList<String>();
//		
//		a.add("2");
//		a.add("3");
//		a.add("a");
//		a.add("as");
//		a.add("df");
//		a.add("2");
//		
//		for(int i=0; i<a.size(); i++) {
//			
//			System.out.println(a.get(i));
//		}

//		System.out.println(a);
		// Collections.sort(a);
		// System.out.println(a);
//		Set b = new HashSet<>(a);
//		a.clear();
//		a.addAll(b);
//
//		System.out.println(a);

	}

}
