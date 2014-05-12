/**
 *  public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }  
 */
package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MarkAndToys {

	
	public static void main(String[] args){

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = reader.readLine();
			String[] str = input.split(" ");
			int nToys = Integer.parseInt(str[0]);
			int cash = Integer.parseInt(str[1]);
			input = reader.readLine();
			String[] costs = input.split(" ");
			int[] nCosts = new int[costs.length];
			int i = 0;
			for(String s : costs){
				nCosts[i++] = Integer.parseInt(s.trim());
			}
			Arrays.sort(nCosts);
			System.out.println(Arrays.toString(nCosts));
			i = 0;
			int bought = 0;
			while(cash > nCosts[i]){
				cash = cash-nCosts[i];
				i++;
				bought++;
			}
			System.out.println(bought);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
