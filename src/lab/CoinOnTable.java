package lab;

import java.util.Scanner;

public class CoinOnTable {

	private static int N = 0;
	private static int M = 0;
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);
		int goalI = 0;
		int goalJ = 0;
		int optimal = 0;
		String line;
		char[][] cell = new char[N][M];
		int i=0, j= 0;
		for(i=0; i< N; i++){
			line = s.nextLine();
			for(j=0; j< M; j++){
				cell[i][j] = line.charAt(j);
				if(cell[i][j] == '*'){
					goalI = i;
					goalJ = j;
					optimal = cost(cell, goalI, goalJ);
				}
			}
		}
		int k=0;
		i=0;
		j=0;
		while(k < K){
			if( !(0 <= i && i < N && 0 <=j && j < M) ){
				System.out.println("Error");
			}
			switch(cell[i][j]){
				case 'U':
					i=i-1;
					break;
				case 'L':
					j=j-1;
					break;
				case 'D':
					i=i+1;
					break;
				case 'R':
					j=j+1;
					break;
			}
			k++;
		}
		if(cell[i][j] == '*'){
			System.out.println("0");
		}else if( optimal <= K){
			System.out.println(optimal);
		}else{
			System.out.println("-1");
		}
	}
	/*
	 * cost to reach cell[i][j]
	 */
	private static int cost(char[][] cell, int i, int j){
		if(i == 0 && j == 0){
			return 0;
		}
		if(! (0<=i && i<N && 0<=j && j<M ) ){
			return Integer.MAX_VALUE;
		}
		int fromTop = Integer.MAX_VALUE; 
		if((1<=i && i<N && 0<=j && j<M ) 
				&& cell[i-1][j] != 'D'){
			fromTop = cost(cell, i-1, j); 
			fromTop++;
		}
		int fromLeft = Integer.MAX_VALUE;
		if((0<=i && i<N && 1<=j && j<M ) 
				&&  cell[i][j-1] != 'R'){
			fromLeft = cost(cell, i, j-1);
			fromLeft++;
		}
		int fromBottom = Integer.MAX_VALUE;
		if((0<=i && i+1<N && 0<=j && j<M ) 
				&& cell[i+1][j] != 'U'){
			fromBottom = cost(cell, i+1, j);
			fromBottom++;
		}
		int fromRight = Integer.MAX_VALUE;
		if((0<=i && i<N && 0<=j && j+1<M ) 
				&& cell[i][j+1] != 'L'){
			fromRight = cost(cell, i, j+1);
			fromRight++;
		}
		
		int a = fromTop < fromLeft ? fromTop: fromLeft;
		int b =fromBottom < fromRight ? fromBottom: fromRight;
		
		return a < b ? a : b;
	}
}
