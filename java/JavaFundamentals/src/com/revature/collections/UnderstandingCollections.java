package com.revature.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnderstandingCollections {

	public static void main(String[] args) {
		set();
	}
	
	static void set() {
		/*
		 * HashSet does not keep track of the order
		 * that the elements are adding in.
		 * completely random.
		 */
		Set<String> mySet = new HashSet<String>();
		mySet.add("Hello"); 				 // 1
		mySet.add("my");    				 // 2
		mySet.add("name");  				 // 3
		mySet.add("ERROR");				 	 // 4
		mySet.add("is");    				 // 5
		mySet.add("is");    				 // 5 - is a duplicate, doesn't get added
		System.out.println(mySet.add("is")); // 5 - adding another is, returns false
		mySet.add("Rex");   				 // 6
		System.out.println(mySet.size());    // prints out 6
		mySet.remove("ERROR"); 				 // removing the ERROR
		System.out.println(mySet.size()); 	 // prints out 5
		Iterator<String> mySetIterator = mySet.iterator(); // creating and setting my cursor
		while(mySetIterator.hasNext()) { 				   // if there exists another element
			System.out.println(mySetIterator.next());      // iterating through mySet with my cursor
		}
	}
}
