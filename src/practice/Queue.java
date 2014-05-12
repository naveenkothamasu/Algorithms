package practice;

public class Queue {

	private static final int QUEUE_EMPTY = -1;
	private static final int QUEUE_FULL = -1;
	
	private int head = 0;
	private int tail = -1;
	private int len = 10;
	private int[] a = new int[len];
	
	public int enqueue(int item){
		if(tail == len-1){
			return QUEUE_FULL;
		}
		a[++tail] = item;
		
		return 0;
	}
	
	public int dequeue(){
		if(head == len){
			return QUEUE_EMPTY;
		}
		return a[++head];
	}
}
