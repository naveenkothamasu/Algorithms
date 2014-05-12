package practice;

public class IterativeBinarySearch {

	public static void main(String[] args){
		
		int a[] = {12,14,15,18,20,23,25,31,34};
		int len = 9;
		int key = 34;
		System.out.println("element " + key + " is at "+ IterativeBinSearch(a, len-1, key));
	}
	
	public static int IterativeBinSearch(int a[], int last, int key){
		
		int start = 0;
		int mid = 0;
		while(start <= last){
			mid = (start+last)/2;
			if(a[mid] == key){
				return mid;
			}else if(a[mid] < key){
				start = mid+1;
			}else{
				last = mid-1;
			}
		}
		
		return -1;
	}
}
