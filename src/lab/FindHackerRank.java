package lab;

import java.util.Scanner;

public class FindHackerRank {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		
		int[] res = new int[N];
		int j = -1;
		String str = null;
		
		while(++j < N){
			str= s.nextLine();
			if(str.equals("hackerrank")){
				res[j] = 0;
			}else if(str.startsWith("hackerrank")){
				res[j] = 1;
			}else if(str.endsWith("hackerrank")){
				res[j] = 2;
			}else{
				res[j] = -1;
			}
		}
		
		for(int i=0; i <j; i++){
			System.out.println(res[i]);
		}
	}
}
