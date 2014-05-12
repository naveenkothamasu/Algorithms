package lab;

public class ncr {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5,6 };
		int r = 3;
		print(a, r);
	}

	public static void print(int a[], int r) {

		for (int i = 0; i < 6; i++) {
			exchange(a, 0, i);
			permute(a, r, i);
			exchange(a, 0, i);
		}
	}

	private static void exchange(int a[], int x, int y) {
		int temp = 0;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	private static void permute(int a[], int r,int skip) {
		int temp = 0;
		for (int len = 1; len < 5; len++) {
			temp =0;
			for (int i = 1; i + len < 6; i++) {
				if(temp < skip){
					temp++;
					continue;
				}
				
				System.out.print(a[0] + ",");
				System.out.println(a[i] + "," + a[i + len]);
			}
		}

	}

}
