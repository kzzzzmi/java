package linkedList;

public class MainTest1 {

	public static void main(String[] args) {

		SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();
		myLinkedList.addNode(1);
		myLinkedList.addNode(2);
		myLinkedList.addNode(3);
		
		myLinkedList.printAll();
	}

}
