package TestWork;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		float sum = 0;
		float i = 1;
		float j = 1;
		while (i <= n) {
			sum += i / j;
			i++;
			j += 2;
		}
		System.out.println(sum);
	}
}
