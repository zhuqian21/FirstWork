package TestWork;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println("�ַ�����תǰ��" + str);
		System.out.println("�ַ�����ת��" + reverse);
	}
}
