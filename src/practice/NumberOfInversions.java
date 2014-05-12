package practice;

public class NumberOfInversions {

	public static void main(String[] args){
		
		int a[] = {6,5,4,3,2,1};
		int len = 6;
		System.out.println("No of inversions = "+ CountInversions(a, 0, len-1));
	}
	
	public static int CountInversions(int a[], int s, int t){
		
		if(s == t){
			return 0;
		}
		int m = (s+t)/2;
		
		return CountInversions( a, s, m) + CountInversions(a, m+1, t) + InversionsAcross(a, s, m, t);
		
	}
	
	public static int InversionsAcross(int a[], int s, int m, int t){
		
		int A[] = new int[m-s+1];
		int B[] = new int[t-m];
		int len1 = m-s+1;
		int last = t-m-1;
		int k = 0, i=0, j = 0;
		int inversions = 0;
		for(; i < (m-s+1); i++, k++){
			A[i] = a[s+i];
		}
		for(i=0; i < (t-m); i++, k++){
			B[i] = a[m+1+i];
		}
		i=0;
		j=0;
		k = s;
		while(i < (m-s+1) && j < (t-m)){
			if(A[i] < B[j]){
				a[k] = A[i];
				i++;
			}else{
				a[k] = B[j];
				inversions += len1-i; //TODO
				j++;
			}
			k++;
		}
		
		if(i == (m-s+1)){
			for(; j < (t-m); j++, k++){
				a[k] = B[j];
			}
		}else{
			for(; i < (m-s+1); i++, k++){
				a[k] = A[i];
			}
		}
		
		return inversions;
	}
	
}
