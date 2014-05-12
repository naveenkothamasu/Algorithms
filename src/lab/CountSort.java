package lab;

import java.util.HashMap;
import java.util.Scanner;

public class CountSort {

	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int len = Integer.parseInt(s.nextLine());
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        int i=0;
        String[] line = new String[2];
        int num;
        int max = 0;
        int[] count = new int[100];
        String[] B = new String[len];
        for(i=0; i<100; i++){
            count[i] = 0;
        }
        for(i=0; i<len/2; i++){
            line = s.nextLine().split(" ");
            num = Integer.parseInt(line[0]);
            if(max < num){
                max = num;
            }
            ++count[num];
            map.put(i, num+" "+"-");
        }
        for(; i<len; i++){
            line = s.nextLine().split(" ");
            num = Integer.parseInt(line[0]);
            if(max < num){
            	max = num;
            }
            ++count[num];
            map.put(i, num+" "+line[1]);
        }
        for(i=1; i<=max; i++){
            count[i] += count[i-1];
        }
        i=0;
        for(int key : map.keySet()){
        	String[] str = map.get(key).split(" ");
        	int indx = (Integer.parseInt(str[0]));
        	if(i < len/2){
        		B[count[indx]] = "-";	
        	}else{
        		B[count[indx]-1] = str[1];
        		--count[indx];
        	}
        	
        	i++;
        }
        for(i=0; i<len; i++){
            System.out.print(B[i] + " ");
        }
        if(s != null){
        	s.close();	
        }
        
	}
}
