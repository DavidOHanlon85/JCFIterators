package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example19Iterators {

	public static void main(String[] args) {

		// Create and ArrayList of Strings

		List<String> myList = new ArrayList<String>();

		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");

		// Obtain an iterator for forward traversal

		Iterator<String> iterator = myList.iterator();
		
		// Iterator through the ArrayList using the iterator
		
		System.out.println("Forward transversal");
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}
		
		// Obtain an iterator again for demonstration purposed
		
		Iterator<String> iteratorAgain = myList.iterator();
		
		System.out.println("\nRemove Elements Based on Condition:");
		while(iteratorAgain.hasNext()) {
			String fruit = iteratorAgain.next();
			if (fruit.startsWith("A")) {
				iteratorAgain.remove();
			} else {
				System.out.println(fruit);
			}
		}
		
		// Display Modified ArrayList
		
		System.out.println("\nModified ArrayList:");
		for (String fruit : myList) {
			System.out.println(fruit);
		}
		
		// Obtain a ListIterator for bidirectional traversal 
		
		ListIterator<String> listIterator = myList.listIterator();
		
		System.out.println("\nBackward Traversal:");
		// note need to go forward first
		listIterator.next();
		listIterator.next();
		
		while (listIterator.hasPrevious()) {
			String fruit = listIterator.previous();
			System.out.println(fruit);
		}

	}

}
