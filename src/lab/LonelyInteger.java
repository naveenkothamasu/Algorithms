package lab;

import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");;
		int len = Integer.parseInt(str[0]);
		str = s.nextLine().split(" ");
		int i=0;
		int[] count = new int[100];
		for(i=0; i<len; i++){
			count[i] = 0;
		}
		for(i=0; i< len; i++){
			++count[Integer.parseInt(str[i])];
			
		}
		for(i=0; i<100; i++){
			if(count[i] == 1){
				System.out.println(i);
				break;
			}
		}
		
		if(s != null){
			s.close();
		}
		
	}
	
}
