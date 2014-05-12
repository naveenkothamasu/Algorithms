package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class StoreCredit {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner s = new Scanner(new File("C:\\Users\\NaveenKumar\\Desktop\\A-large-practice.in"));
		int testcases = Integer.parseInt(s.nextLine());
		int j= -1, i=0;
		String[] results = new String[testcases];
		
		while(++j < testcases){
			int credit = Integer.parseInt(s.nextLine());
			int len = Integer.parseInt(s.nextLine());
			String[] line = s.nextLine().split(" ");
			Hashtable<Integer, String> v = new Hashtable<Integer, String>();
			
			for(i=1; i<=len; i++){
				int intValue = Integer.parseInt(line[i-1]);
				if(v.containsKey(intValue)){
					v.put(intValue, v.get(intValue)+ " "+i);
				}else{
					v.put(intValue, Integer.toString(i));
				}
				
			}
			results[j] = chooseItems(v, j, credit);
		}

		for(j=0; j < testcases; j++){
			System.out.println(results[j]);
		}
	}
	
	private static String chooseItems(Hashtable<Integer, String> v, int j, int credit){
		StringBuffer ret = new StringBuffer("Case #");
		ret =ret.append(j+1);
		ret = ret.append(": ");
		int partner = 0;
		Integer k = 0;
		for(Integer key: v.keySet()){
			k = key;
			partner = credit - key;
			if(v.containsKey(partner)){
				break;
			}
		}
		if(k == partner){
			ret.append(v.get(k));
		}else{
			if(Integer.parseInt(v.get(k)) < Integer.parseInt(v.get(partner)) ){
				ret = ret.append(v.get(k));
				ret = ret.append(" ");
				ret = ret.append(v.get(partner));
			}else{
				ret = ret.append(v.get(partner));
				ret = ret.append(" ");
				ret = ret.append(v.get(k));
			}
			
		}
		
		
		
		return ret.toString();
	}
}
