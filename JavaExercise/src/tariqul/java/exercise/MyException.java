package tariqul.java.exercise;

public class MyException extends RuntimeException {
	
	public static final int CIRCULAR_QUEUE_EMPTY_EXCEPTION = 1;
	public static final int CIRCULAR_QUEUE_OVERLOAD_EXCEPTION = 2;

	public MyException(){
		super();
	}
	
	public MyException(String message, int exceptionType){
		super(message);
		System.out.println("Exception Type -- "+exceptionType);
	}
}
