package lab;

import java.util.Scanner;

public class Comments {

	public static void main(String[] args){
		
		String[] comments = new String[200];
		Scanner s = new Scanner(System.in);
		String str = "init";
		int beginIndex = 0;
		int i = 0;
		while( (!str.contains("*/"))
				&& !(str = s.nextLine()).contains("}")
				){
			if((beginIndex = str.indexOf("//")) != -1){
				comments[i++] = str.substring(beginIndex);
			}
			if((beginIndex = str.indexOf("/*")) != -1){
				comments[i++] = str.substring(beginIndex);
				if(!str.contains("*/")){
					while((str = s.nextLine()).contains("*/") == false){
						comments[i++] = str;
					}	
					comments[i++] = str;
				}
			}
		}
		for(int j=0; j<i;j++){
			System.out.println(comments[j]);
		}
	}
}
