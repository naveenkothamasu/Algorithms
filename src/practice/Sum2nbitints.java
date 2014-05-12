package practice;

public class Sum2nbitints {

	public static void main(String[] args){
		int a[] = {1,2,3,4};
		int b[] = {9,8,7,6};
		
		int c[] = {0, 0, 0, 0, 0};
		int i=0;
		
		sum(a,b,c,4);
		
		System.out.println(c[0]+""+c[1]+""+c[2]+""+c[3]+""+c[4]);
	}
	
	public static void sum(int a[], int b[], int c[], int count){
		
		int temp = 0;
		int i=count-1;
		for(; i >= 0; i--){
			temp = a[i]+b[i]+c[i+1];
			c[i+1] = temp % 10;
			temp = temp /10;
			c[i] = temp % 10;
		}
	}
}
