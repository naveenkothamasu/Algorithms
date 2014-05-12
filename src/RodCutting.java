import java.util.Scanner;


public class RodCutting {

	
	public static void main(String[] args){
	
		int[] price = new int[11];

		price[0] = 0;
		price[1] = 1;
		price[2] = 5;
		price[3] = 8;
		price[4] = 9;
		price[5] = 10;
		price[6] = 17;
		price[7] = 17;
		price[8] = 20;
		price[9] = 24;
		price[10] = 30;
		
		System.out.print("Enter length of the rod:\t");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CUT_ROD(price,n));
	}
	
	public static int CUT_ROD(int[] price, int n){
	
		if(n == 0){
			return 0;
		}
		int max = -Integer.MAX_VALUE;
		for(int i=1; i<= n; i++){
			max = Math.max(max, price[i]+CUT_ROD(price, n-i));
		}
		
		return max;
	}
}
