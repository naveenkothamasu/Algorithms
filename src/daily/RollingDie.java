package daily;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RollingDie {

	public static void main(String[] args) {
		int a, b, c, smallest, largest, product;
		double average;

		DecimalFormat format = new DecimalFormat("##.##");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three ints: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		average = (a + b + c) / 3;
		product = a * b * c;

		if (a >= b)
			if (a >= c) {
				largest = a;
				if (b >= c)
					smallest = c;
				else
					smallest = b;
			} else {
				largest = c;
				smallest = b;
			}

		else if (b >= c) {
			largest = b;
			if (a >= c)
				smallest = c;
			else
				smallest = a;
		}

		else {
			largest = c;
			if (a >= b)
				smallest = b;
			else
				smallest = a;
		}

		System.out.println("Smallest: " + smallest + " Largest: " + largest
				+ " product: " + product + " Average: "
				+ format.format(average));

	}
}
