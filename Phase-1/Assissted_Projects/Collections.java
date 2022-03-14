package com.collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// arraylist
		System.out.println("1) ArrayList..............");
		ArrayList<String> a = new ArrayList<String>();

		a.add("Ram");//String Data to the ArrayLisit
		a.add("Sita");
		a.add("Ravi");
		Iterator al = a.iterator();
		while (al.hasNext()) {
			System.out.println("ArrayList is : "+al.next());
		}

		// vector
		System.out.println("\n");
		System.out.println("2) Vector.....................");
		Vector<Integer> v = new Vector();
		v.addElement(10);//Int Data to the Vector
		v.addElement(45);
		v.addElement(34);
		v.addElement(55);
		System.out.println("Vector data are : "+v);

		// linkedlist
		System.out.println("\n");
		System.out.println("3) LinkedList................");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Alex");
		names.add("John");
		System.out.println("Linkedlist is :  " + names);
		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

			// hashset
			System.out.println("\n");
			System.out.println("4) HashSet...................");
			HashSet<Integer> hashset = new HashSet<Integer>();
			hashset.add(101);
			hashset.add(103);//Duplicates not allowed
			hashset.add(103);
			hashset.add(104);
			System.out.println("HashSet data is : "+hashset);

			// linkedhashset
			System.out.println("\n");
			System.out.println("5) LinkedHashSet................");
			LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
			lhs.add(11);
			lhs.add(14);
			lhs.add(12);
			lhs.add(14);
			System.out.println("LinkedHashSet Is : "+lhs);
		
	}
}
