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
		CircularQueue cqueue = new CircularQueue(10);
		cqueue.insert("A");
		cqueue.insert("B");
		System.out.println(cqueue.remove());
		System.out.println(cqueue.remove());
		System.out.println(cqueue.remove());
	}

}
