import java.util.*;

//parent class
class Person{
	public Person(){
		System.out.println("Constructor of Parent");
	}
}

//child class
class Student extends Person{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Hello");//Appends the specified element to the end of this list.
		list.add("World");
		list.add(2, "Hi EveryOne");//Inserts the specified element at the specified position in this list.
		// it gives exception if index is great than size+1

		//addFirst(E e)
		//Inserts the specified element at the beginning of this list.
		list.addFirst("Today");

		//addLast(E e)
		//Appends the specified element to the end of this list.
		list.addLast("Bye");
		System.out.println(list); 
		//clone()
		//Returns a shallow copy of this LinkedList.
		 System.out.println(list.clone());

		 //	contains(Object o)
		//Returns true if this list contains the specified element
		 System.out.println("list contains Hi: "+list.contains("Hi"));

		 //	element()
		//Retrieves, but does not remove, the head (first element) of this list.
		 System.out.println(list.element());

		 //	get(int index)
		//Returns the element at the specified position in this list.
		 System.out.println(list.get(2));

		 // getFirst()
		//Returns the first element in this list
		 System.out.println("First element of the list is: "+list.getFirst());

		 //getLast()
		//Returns the last element in this list.

		 System.out.println("Last element of the list is: "+list.getLast());


		 //clear()
		//Removes all of the elements from this list.
		 list.clear();

	}
} 