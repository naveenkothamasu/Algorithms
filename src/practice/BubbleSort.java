package practice;

public class BubbleSort {

	public static void main(String[] args){
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		int len = 9;
		BubbleSort(a, len-1);
		for(int i=0; i < len; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void BubbleSort(int a[], int last){
		int j = 0;
		int temp = 0;
		for(int i=last; i >= 0; i--){
			for( j=0 ; j <= i-1 ; j++){
				if(a[j+1] < a[j]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
