package cn.itcast_01;

import java.util.Scanner;

/*
 * 正则表达式：符合一定规则的字符串
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();

		System.out.println("checkQQ:" + checkQQ(qq));
	}
	
	public static boolean checkQQ(String qq){
		// String regex = "[1-9][0-9]{4,14}";
		// //public boolean matches(String regex):告知此字符串是否匹配给定的正则表达式
		// boolean flag = qq.matches(regex);
		// return flag;
		
		//return qq.matches("[1-9][0-9]{4,14}");//第一位只能是1-9的数字，剩下的4到14位都是0-9的数字
		return qq.matches("[1-9]\\d{4,14}");
	}
}
