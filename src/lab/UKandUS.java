package lab;

import java.util.Scanner;

public class UKandUS {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		String[] line = new String[10];
		int j = 0;
		while(j < N){
			line[j] = s.nextLine();
			j++;
		}
		int T = Integer.parseInt(s.nextLine());
		int[] res = new int[T];
		String aWord = null;
		String bWord = null;
		int t = -1;
		int aCount = 0;
		int bCount = 0;
		while(++t < T){
			aWord = s.nextLine();
			bWord = aWord.substring(0, aWord.length()-2)+"se";
			j=0;
			aCount = 0;
			bCount = 0;
			while(j < N){
				if(line[j].contains(aWord)){
					++aCount;
				}
				if(line[j].contains(bWord)){
					++bCount;
				}
				j++;
			}
			
			res[t] = aCount+bCount;
				
		}
		
		for(int i=0; i< t; i++){
			System.out.println(res[i]);
		}
		
	}
}
