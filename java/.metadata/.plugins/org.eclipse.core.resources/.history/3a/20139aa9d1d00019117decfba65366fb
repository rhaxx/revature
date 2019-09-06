package com.revature.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnderstandingCollections {

	public static void main(String[] args) {
		
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
		
		Iterator<String> mySetIterator = mySet.iterator(); // setting my cursor
		while(mySetIterator.hasNext()) {
			System.out.println(mySetIterator.next()); // iterating through mySetIterator
		}
		
	}
}
