//HW-5.2
//Create a LinkedList for the Node class in this assignment
//Implement code for all methods for the LinkedList and create a main program to test each method - a large portion of this was covered in class

public class MyLinkedList {

	private Node head;
	
	//Default constructor
	MyLinkedList() {
		head = null;
	}
	
	//Method to add a Node to the end of the LinkedList
	public void addNode(Node n) {
		Node trav = head;
		
		if(head == null) {
			head = n;
		} else {
			while(trav.next != null)
				trav = trav.next;
			trav.next = n;
		}
	}
	
	//Method to print each element in the LinkedList
	public void printList() {
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.name);
			trav = trav.next;
		}
	}
	
	//Method to add Node n before given index value
	public void insertBefore(int index, Node n) {
		Node trav = head;
		int count = 0;
		
		if(index == 0) {
			n.next = head;
			head = n;
		} else {
			while(count < index-1) {
				trav = trav.next;
				count++;
			}
			n.next = trav.next;
			trav.next = n;
		}
	}
	
	//Method to add Node n after index value
	public void insertAfter(int index, Node n) { //This will essentially be like insertBefore, but without having to account for inserting before a head, and with inserting at an index instead of index-1
		Node trav = head;
		int count = 0;
		
		while(count < index) {
			trav = trav.next;
			count++;
		}
		n.next = trav.next;
		trav.next = n;
	}
	
	//Method to return index of where String str is located. Returns -1 if String str is not in LinkedList
	public int indexOf(String str) {
		Node trav = head;
		int count = 0;
		
		boolean found = false;
		while(trav != null && !found) {
			if(trav.name.equals(str))
				found = true; //exit loop
			trav = trav.next;
			count++;
		}
		if(found == false)
			return -1;
		else
			return count-1; //count gives the number of the element in the list, but we want index (and index starts at 0)
	}
	
	//Method to remove Node at index value
	public void removeNodeAt(int index) {
		//if head element is removed, the head must be replaced
		if(index == 0)
			head = head.next; //(And original head is lost/removed automatically)
		else {
			Node trav = head;
			int count = 0;
			
			while(count < index-1) {
				trav = trav.next;
				count++;
			}
			trav.next = trav.next.next; //follow the bouncing dots! - replaces the element at index with the element after it (we need to jump over the element at trav, otherwise, the list will come up the same, without any element removed)
		}
	}

}
