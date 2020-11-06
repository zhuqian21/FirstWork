package TestWork;

import java.util.Scanner;

public class CapitalPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Capital(str);
	}

	public static void Capital(String str) {
		String[] split = str.split(" ");// 按空格分隔成数组
		for (int i = 0; i < split.length; i++) {
			// String str2 = split[i].substring(0, 1).toUpperCase()+
			// split[i].substring(1);
			String str2 = split[i].substring(0, 1).toUpperCase();
			System.out.print(str2);
		}
	}
}
