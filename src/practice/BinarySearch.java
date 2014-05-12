package practice;

public class BinarySearch {

	public static void main(String[] args){
		
		int a[] = {12,56,87,90,134,567,765,890,1234};
		int len = 9;
		int key = 567;
		System.out.println("Element " + key + " is at : " + BinSearch(a, 0, len-1, key));
		
	}
	
	public static int BinSearch(int a[], int start, int len, int key){
		
		if(start > len){
			return -1;
		}
		int mid = (start+len)/2;
		
		if(a[mid] > key){
			return BinSearch(a, start, mid-1, key);
		}else if(a[mid] < key){
			return BinSearch(a, mid+1, len, key);
		}else{
			return mid;
		}
		
 
	}
}
