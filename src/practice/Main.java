package practice;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args){
		System.out.println("Hello..");
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(0, "Naveen");
		map.put(1, "Nalanda");
		map.put(2, "Bits");
		
		for(int i=0; i < 3; i++){
			System.out.println(map.get(i));
		}
	}
}
