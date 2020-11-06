package TestWork;

import java.util.Scanner;

public class TestX {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a, b, c;
		a = cin.nextInt();
		b = cin.nextInt();
		c = cin.nextInt();
		int flag = 0;
		for (int x = 1000; x <= 9999; x++) {
			if (x % a == 0 && (x + 1) % b == 0 && (x + 2) % c == 0) {
				flag = 1;
				System.out.println(x);
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Impossible");
		}
	}
}
