package school;

import java.util.ArrayList;
import java.util.Hashtable;

public class MyHashtable {

	public static void main(String[] args){
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("three", 3);
		
		Integer n = ht.get("three");
		System.out.println(n);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Naveen");
		al.add("Meg");
		al.add("Sunil");
		al.add("Kaushik");
		
		for(String candidate: al){
			System.out.println(candidate);
		}
		System.out.println("Case 1");
		String str1 = "Hello";
		String str2 = "Hello";
		if(str1 == str2){
			System.out.println("str1 and str2 share the same memory chunk");
		}else{
			System.out.println("str1 and str2 do not share the same memory chunk");
		}
		System.out.println("Case 2");
		str1 = new String("Hello");
		str2 = new String("Hello");
		
		if(str1 == str2){
			System.out.println("str1 and str2 share the same memory chunk");
		}else{
			System.out.println("str1 and str2 do not share the same memory chunk");
		}
	}
}
