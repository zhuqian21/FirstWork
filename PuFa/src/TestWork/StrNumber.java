package TestWork;

import java.util.Scanner;

public class StrNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(zipString(str));
	}

	public static Object zipString(String str) {
		int flog = 1;
		StringBuffer str2 = new StringBuffer();//

		if (str.length() <= 2) {
			return str;// �����str����С�ڵ���2��һ������ԭ�ַ�����
		}

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i - 1) == str.charAt(i)) {
				flog++;// ��¼�ַ����ִ���
			} else {
				str2.append(str.charAt(i - 1)).append(flog);
				flog = 1;// ���ַ��ͳ��ִ���д�룻
			}
		}

		str2.append(str.charAt(str.length() - 1)).append(flog);// ���һ���ַ�Ҫ�Լ�����д�룬ԭ���ԣ�

		if (str.length() <= str2.length()) {
			return str;
		} else {
			return str2;
		}

	}
}
