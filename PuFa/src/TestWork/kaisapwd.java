package TestWork;

import java.util.Scanner;

public class kaisapwd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[A:加密][J:解密],请选择一个");
		Scanner c = new Scanner(System.in);// 创建Scanner对象
		String s1 = c.nextLine();// 获取本行的字符串
		if (s1.equalsIgnoreCase("A")) {// 判断变量s1与A是否相等，忽略大小
			System.out.println("请输入明文：");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println("请输入密钥:");
			Scanner sc1 = new Scanner(System.in);
			int key = sc1.nextInt();// 将下一输入项转换成int类型
			Encryption(s, key);// 调用Encryption方法
		} else if (s1.equalsIgnoreCase("J")) {
			System.out.println("请输入密文:");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println("请输入密钥：");
			Scanner sc1 = new Scanner(System.in);
			int key = sc1.nextInt();
			Decrypt(s, key);// 调用Decrypt方法
		}
	}

	public static void Decrypt(String str, int n) {
		// TODO Auto-generated method stub
		// 解密
		int k = Integer.parseInt("-" + n);
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);// 用于返回指定索引处的字符
			if (c >= 'a' && c <= 'z') {// 如果字符串中的某个字符是小写字母
				c += k % 26;// 移动key%26位
				if (c < 'a')
					c += 26;// 向左超界
				if (c > 'z')
					c -= 26;// 向右超界
			} else if (c >= 'A' && c <= 'Z') {// 如果字符串中的某个字符是大写字母
				c += k % 26;// 移动key%26位
				if (c < 'A')
					c += 26;// 向左超界
				if (c > 'Z')
					c -= 26;// 向右超界
			}
			string += c;// 将解密后的字符连成字符串
		}
		System.out.println(str + "解密后为：" + string);
	}

	public static void Encryption(String str, int k) {
		// TODO Auto-generated method stub
		// 加密
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {// 如果字符串中的某个字符是小写字母
				c += k % 26;// 移动key%26位
				if (c < 'a')
					c += 26;// 向左超界
				if (c > 'z')
					c -= 26;// 向右超界
			} else if (c >= 'A' && c <= 'Z') {// 如果字符串中的某个字符是大写字母
				c += k % 26;// 移动key%26位
				if (c < 'A')
					c += 26;// 向左超界
				if (c > 'Z')
					c -= 26;// 向右超界
			}
			string += c;// 将解密后的字符连成字符串
		}
		System.out.println(str + "加密后为：" + string);
	}
}