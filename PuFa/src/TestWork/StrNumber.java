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
			return str;// 输入的str长度小于等于2，一定返回原字符串；
		}

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i - 1) == str.charAt(i)) {
				flog++;// 记录字符出现次数
			} else {
				str2.append(str.charAt(i - 1)).append(flog);
				flog = 1;// 将字符和出现次数写入；
			}
		}

		str2.append(str.charAt(str.length() - 1)).append(flog);// 最后一个字符要自己额外写入，原因略；

		if (str.length() <= str2.length()) {
			return str;
		} else {
			return str2;
		}

	}
}
