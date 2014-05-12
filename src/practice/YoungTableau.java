package practice;

public class YoungTableau {

	public static int heap_size = 0;
	
	public static void main(String[] args){
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		int[][] yt = new int[4][4];
	}
	
	public static int EXTRACT_MIN(int yt[][], int m, int n){
		
		if(m == 0 && n ==0){
			return yt[0][0];
		}
		int one = EXTRACT_MIN(yt, m-1, n);
		int two = EXTRACT_MIN(yt, m, n-1);
		if (one < two ){
			return EXTRACT_MIN(yt, m-1, n);
		}else{
			return EXTRACT_MIN(yt, m, n-1);
		}
	}
	
	public static void INSERT(int yt[][], int m, int n, int x){
		
		int i=0, j=0;
		
		for( ; i<m; i++){
			for(j=0 ; yt[i][j] < x && j < n; j++){
			}
		}
	}
}
