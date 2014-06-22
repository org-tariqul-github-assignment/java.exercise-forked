package tariqul.java.exercise;

/*
 * Circular queue / ring buffer implementation 
 * Using an array of fixed size. When array is full, the oldest one should be deleted to make room
 */
public class CircularQueue {
	private int N; // capacity (size of buffer)
	private int f = 0; // front index
	private int r = 0;  // rear index
	private Object[] buffer;
	
	public CircularQueue(int capacity) {
		N = capacity;
		buffer = new Object[N];
	}
	
	public int size(){
		if(r>f){
			return r-f;
		}else{
			return N-f+r;
		}
	}
	public boolean isEmpty(){
		return (f==r)? true: false;
	}
	
	//enqueue
	public void insert(Object ob)
	{
		/*
		// if you do not want to insert when capacity is full,then you can throw a runtime exception like below 
		if(size()>=N){ // N: capacity
            throw new MyException("Queue Full", MyException.CIRCULAR_QUEUE_OVERLOAD_EXCEPTION);
		}
		 */
		buffer[r] = ob;
		r = (r+1)%N;
	}
	
	//dequeue
	public Object remove() throws MyException{
		Object item; 
        if(isEmpty()){
            throw new MyException("Queue Empty", MyException.CIRCULAR_QUEUE_EMPTY_EXCEPTION);
        }else{
            item = buffer[f];
            buffer[f] = null;
            f = (f + 1) % N;
        }
       return item;	
	}	
	
	
}
