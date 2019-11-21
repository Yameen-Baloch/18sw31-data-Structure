class LinkedListDemo{
	Node start;

	//inner class
	public static class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
		}

	}// end of inner class


	// method for inserting new elements 
	public static LinkedListDemo insert(LinkedListDemo list, int data){
		Node node = new Node(data);

		if(list.start == null)
			list.start = node;
		else{
		Node temp = list.start;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}
		return list;
}

	// method for removing first element element
	public static LinkedListDemo firstDelete(LinkedListDemo list){
		if(list.start == null){
			throw new NullPointerException("Linked List is empty");
		}
		else{
		Node temp = list.start;
		list.start = temp.next;

	}
	return list;

}
	
	// deleting element form any index;
	public static LinkedListDemo delete(LinkedListDemo list, int index){
		Node temp = list.start;
		int count = 0;
		if(index == 0){
			System.out.println("Item at "+index+" is deleted " +temp.data);
			firstDelete(list); // if element at first index
			return list;
	}

		// if index number is greater than the size of list or less than zero 
		// which is illegal input
		else if(index > size(list) || index < 0){
			throw new NullPointerException("Cannot delete item");
		}
		// if element is found at any particular index
		else{
			Node n = list.start;
        	for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        	
        	n.next = n.next.next;
        
    }
        return list;
		
}

	//method for returning sum of all elements link
	public int sum(LinkedListDemo list){
		int sum = 0;
		Node temp = list.start;
		while(temp != null){
			sum += temp.data;
			temp = temp.next;
		}
		return sum;
	}

	//Setting a particular element at particular index number
	//but the index number must not exceed int size of list
		public LinkedListDemo set(LinkedListDemo list, int pos, int data){
		Node new_node = new Node(data);
		if(pos < 1 && pos > size(list)+1){
			System.out.println("Invalid position for inserting");
			return list;
		}
		if(pos == 0 && list.start != null){
			list.start.data = data;
			return list;
		}
		
			int count = 0;
			Node temp = list.start;
			while(temp != null){
				if(count == pos){
					break;
				}
				temp = temp.next;
				count++;
			}
			temp.data = data;
			return list;
	}

	//getting particular element from list at particular method.
		public void get(LinkedListDemo list, int index){
		int count = 0;
		Node temp = list.start;
		while(temp != null){
			if(count == index){
				System.out.println("Element Found at "+"index"+" is: "+temp.data);
			}
			count++;
			temp = temp.next;
		}

	}


	
	//method for returning size
	public static int size(LinkedListDemo list){
		Node temp = list.start;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	
	// method for display the list
	public static void display(LinkedListDemo list){
		Node temp = list.start;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;

		}
	}
}

class Task{
	public static void main(String[] args) {
		LinkedListDemo list = new LinkedListDemo();
		
		list = list.insert(list, 12);
		list = list.insert(list, 25);
		list = list.insert(list, 1);
		list.display(list);
		System.out.println("Size of list is: "+list.size(list));
		System.out.println("Sum of list is: "+list.sum(list));
		list.delete(list, 0);
		System.out.println("After deleting first element:");
		list.display(list);
		System.out.println("After deletion Size of list is: "+list.size(list));
		list.set(list, 1, 13);
		list.display(list);
		list.get(list, 1);


	}
}