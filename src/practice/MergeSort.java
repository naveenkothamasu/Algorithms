package practice;

public class MergeSort {

	public static void main(String[] args) {

		int a[] = { -10,9,8,7,6,5,4,3,2,1};
		int len = 10;
		mergesort(a, 0, len-1);
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void mergesort(int a[], int s, int t) {

		if (s == t) {
			return;
		}
		int m = (s + t) / 2;
		mergesort(a, s, m);
		mergesort(a, m + 1, t);
		merge(a, s, m, t);
	}

	public static void merge(int a[], int s, int m, int t){
		
		int A[] = new int[5];
		int B[] = new int[5];
		int i = 0, j = 0;
		int k=s;
		for(i=0; i < (m-s)+1; i++){
			A[i] = a[s+i];
		}
		for(i=0; i < (t-m); i++){
			B[i] = a[m+1+i];
		}
		i = 0;
		j = 0;
		while( (i < (m-s)+1)
				&& ( j < (t-m)) ) {
		
			if(A[i] < B[j]){
				a[k] = A[i];
				i++;
			}else{
				a[k] = B[j];
				j++;
			}
			k++;
		}
		
		if(i > m-s+1){
			for(; j < t-m; j++, k++){
				a[k] = B[j];
			}
		}else{
			for(; i < m-s+1; i++, k++){
				a[k] = A[i];
			}
		}
	}
}
