package school;

public class MyStringBuilder {

	public static void main(String[] args){
		
		String str = "";
		String rstr = "";
		int size = 16384;
		char ch = 'a';
		int count = 0;

		for(count=1; count < size; count++){
			str += ch++;
			if(ch > 'z'){
				ch = 'a';
			}
		}
		long beginTime = System.nanoTime();
		for(int i=str.length()-1; i >= 0 ; i--){
			rstr += str.charAt(i);
		}
		long elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time: "+ elapsedTime/1000 + " usecs using String reverse");
		
		
		StringBuffer sbf = new StringBuffer("");
		for(count=1; count < size; count++){
			sbf.append(ch++);
			if(ch > 'z'){
				ch = 'a';
			}
		}
		beginTime = System.nanoTime();
		for(int i=str.length()-1; i >= 0 ; i--){
			sbf = sbf.append(str.charAt(i));
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time: "+ elapsedTime/1000 + " usecs using StringBuffer manual reverse");

		beginTime = System.nanoTime();
		sbf = sbf.reverse();
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time: "+ elapsedTime/1000 + " usecs using StringBuffer reverse method");
		

		StringBuilder sb = new StringBuilder("");
		for(count=1; count < size; count++){
			sb.append(ch++);
			if(ch > 'z'){
				ch = 'a';
			}
		}
		beginTime = System.nanoTime();
		for(int i=str.length()-1; i >= 0 ; i--){
			sb = sb.append(str.charAt(i));
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time: "+ elapsedTime/1000 + " usecs using StringBuilder manual reverse");
		
		
		beginTime = System.nanoTime();
		sb = sb.reverse();
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time: "+ elapsedTime/1000 + " usecs using StringBuilder reverse method");

		
	}
}
