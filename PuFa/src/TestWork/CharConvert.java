package TestWork;

import java.util.Scanner;

public class CharConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			// ���ַ���ת�����ַ�����
			char[] chs = line.toCharArray();
			System.out.println(chs);
			// �����ַ�����
			for (int x = 0; x < chs.length; x++) {
				if (Character.isLowerCase(chs[x])) {
					chs[x] = Character.toUpperCase(chs[x]);
				} else if (Character.isUpperCase(chs[x])) {
					chs[x] = Character.toLowerCase(chs[x]);
				}
			}
			System.out.print(String.valueOf(chs));
		}
	}
}
