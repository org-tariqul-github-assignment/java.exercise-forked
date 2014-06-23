package tariqul.java.exercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(Utilities.reverseString("abcd"));
		System.out.println(Utilities.reverseString2("abcd"));
		System.out.println(Utilities.reverseString3("abcd"));
		*/
		
		// Circular queue
		/*
		CircularQueue cqueue = new CircularQueue(10);
		cqueue.insert("A");
		cqueue.insert("B");
		System.out.println(cqueue.remove());
		System.out.println(cqueue.remove());
		System.out.println(cqueue.remove());
		*/
		
		
		//BST Insert and In Order Traverse
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(2);
		bst.insert(10);
		bst.insert(20);
		bst.insert(7);
		bst.inorder();
		
	}

}
