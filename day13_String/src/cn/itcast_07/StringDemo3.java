package cn.itcast_07;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入"abc"
 * 输出结果："cba"
 * 
 * 分析：
 * 		A：键盘录入一个字符串
 * 		B：定义一个新字符串
 * 		C：倒着遍历字符串，得到每一个字符
 * 			遍历方式：
 * 			a:length()和charAt()结合
 * 			b:把字符串转成字符数组
 * 		D：用新字符串把每一个字符拼接起来
 *		E：输出新字符串 
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		/*
		// 定义一个新的字符串
		String result = "";

		// 把字符串转成字符数组
		char[] chs = line.toCharArray();

		// 倒着遍历字符串，得到每一个字符
		for (int x = chs.length - 1; x >= 0; x--) {
			// 用新字符串把每一个字符拼接起来
			result += chs[x];
		}
		
		// 输出反转后的新字符串
		System.out.println("反转后的新字符串：" + result);
		*/
		
		
		// 改进后的功能实现
		String result = myReverse(line);
		System.out.println("实现功能后的结果是："+result);

	}

	/*
	 * 两个明确： 返回值类型：String 参数列表：String
	 */
	public static String myReverse(String line) {
		// 定义一个新的字符串
		String result = "";

		// 把字符串转成字符数组
		char[] chs = line.toCharArray();

		// 倒着遍历字符串，得到每一个字符
		for (int x = chs.length - 1; x >= 0; x--) {
			// 用新字符串把每一个字符拼接起来
			result += chs[x];
		}
		return result;
	}

}
