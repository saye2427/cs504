//HW-5.2

public class MyLinkedListTest {
	
	public static void main(String[] args) {
	
		MyLinkedList testList = new MyLinkedList();
		
		//Test addNode method and printList
		System.out.println("Original list:");
		testList.addNode(new Node("Steven"));
		testList.addNode(new Node("Gertrude"));
		testList.addNode(new Node("Jemima"));
		testList.addNode(new Node("Chase"));
		
		testList.printList();
		
		//Test both insert methods
		System.out.println("");
		System.out.println("Insert a name before index 1 of list:");
		testList.insertBefore(1, new Node("Darwin"));
		testList.printList();
		
		System.out.println("");
		System.out.println("Insert a name before head of list:");
		testList.insertBefore(0, new Node("Mary"));
		testList.printList();
		
		System.out.println("");
		System.out.println("Insert a name after index 4 of list:");
		testList.insertAfter(4, new Node("Michael"));
		testList.printList();
		
		//Test indexOf method
		System.out.println("");
		System.out.println("Get index of Michael");
		System.out.println(testList.indexOf("Michael"));
		System.out.println("Get index of a name not in the list");
		System.out.println(testList.indexOf("Sarah"));
		
		//Test removeNodeAt method
		System.out.println("");
		System.out.println("Remove name at index 5");
		testList.removeNodeAt(5);
		testList.printList();
		
		System.out.println("");
		System.out.println("Remove head");
		testList.removeNodeAt(0);
		testList.printList();
		
	}
	
}
