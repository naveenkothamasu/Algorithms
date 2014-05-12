package practice;

public class Stack {

	private static int OVERFLOW = -1;
	private static int UNDERFLOW = -1;
	
	private int len = 20;
	private int a[] = new int[len];
	private int top = -1;
	
	public int push(int item){
		
		if(top == len-1){
			return OVERFLOW;
		}
		a[++top] = item;
		
		return 0;
	}
	
	public int pop(){
		
		if(top < 0){
			return UNDERFLOW;
		}
		return a[top--];
	}
	
	public static void main(String[] args){
		
		Stack s = new Stack();
		int ret = 0, i =0;
		for(i=0; i< s.len; i++){
			ret = s.push(i);
			if(ret < 0){
				System.out.println(OVERFLOW);
			}
		}
		while( (ret=s.pop()) >= 0){
			System.out.print(ret+ " ");
		}
	}
}
