package practice;

public class TwoElemsSum {

	public static void main(String[] args){
		
		int a[] = {10,9,8,7,6,5,4,3,2,1};
		int len = 10;
		int sum = 15;
		MergeSort.mergesort(a, 0, len-1);
		for(int i=0; i < len; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		findSum(a, 0, len-1, sum);
		
	}
	
	public static void findSum(int a[], int s, int t, int sum){
		
		int f =0, n=0;
		int in = 0;
		for(int i=0; i<=(s+t)/2; i++){
			f = a[i];
			n = BinarySearch.BinSearch(a, s, t, sum-f);
			if(n != -1){
				in = 1;
				System.out.println("Elements are: "+ f +" and " + a[n]);
			}
		}
		if(in == 0){
			System.out.println("No solution");
		}
		/*int m = 0;
		int temp = 0;
		while(s < t){
			m = (s+t)/2;
			if(s == m || m == t){
				break;
			}
			temp = a[s]+a[t];
			if(temp < sum){
				s = m;
			}else if(temp > sum){
				t = m;
			}else{
				System.out.println("Elements :" + a[s] + " and "+ a[t]);
				return;
			}
		}
		System.out.println("no solution");
		*/
	}
		
}
