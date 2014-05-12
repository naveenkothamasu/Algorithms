package lab;

import java.util.HashMap;
import java.util.Scanner;

public class CountSortPreview {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        int len = Integer.parseInt(s.nextLine());
        HashMap<Integer,String> a = new HashMap<Integer,String>();
        int i=0, num=0, j=0;
        String[] line = new String[2];
        int[] count = new int[100];
        for(i=0; i<100; i++){
            count[i] = 0;
        }
        for(i=0; i<len; i++){
            line = s.nextLine().split(" ");
            num = Integer.parseInt(line[0]);
            a.put(num, line[1]);
            ++count[num];
        }
        for(i=1; i<100; i++){
            count[i] += count[i-1];
        }
        for(i=0; i<100; i++){
            System.out.print(count[i] + " ");
        }
        
	}
}
