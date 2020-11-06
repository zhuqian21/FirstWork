package cn.itcast_02;
/*
 * public static boolean isUpperCase(char ch):判断给定的字符是不是大写字符
 * public static boolean isLowerrCase(char ch)：判断给定的字符是不是小写字符
 * public static boolean isDigit(char ch)：判断给定的字符是不是数字字符
 * public static char toUpperCase(char ch)：把给定的字符转换成大写字符
 * public static char toLowerCase(char ch)：把给定的字符转换成小写字符
 */
public class CharacterDemo {
	public static void main(String[] args) {
		//public static boolean isUpperCase(char ch):判断给定的字符是不是大写字符
		
		//静态方法，直接用类名调用
		System.out.println("isUpperCase:"+Character.isUpperCase('A'));
		System.out.println("isUpperCase:"+Character.isUpperCase('a'));
		System.out.println("isUpperCase:"+Character.isUpperCase('0'));
		
		//public static boolean isLowerrCase(char ch)：判断给定的字符是不是小写字符

		System.out.println("isLowerCase:"+Character.isLowerCase('A'));
		System.out.println("isLowerCase:"+Character.isLowerCase('a'));
		System.out.println("isLowerCase:"+Character.isLowerCase('0'));
		
		//public static boolean isDigit(char ch)：判断给定的字符是不是数字字符

		System.out.println("isDigit:"+Character.isDigit('A'));
		System.out.println("isDigit:"+Character.isDigit('a'));
		System.out.println("isDigit:"+Character.isDigit('0'));
		
		//public static char toUpperCase(char ch)：把给定的字符转换成大写字符
		System.out.println("toUpperCase:"+Character.toUpperCase('A'));
		System.out.println("toUpperCase:"+Character.toUpperCase('a'));
		
		//public static char toLowerCase(char ch)：把给定的字符转换成小写字符
		System.out.println("toLowerCase:"+Character.toLowerCase('A'));
		System.out.println("toLowerCase:"+Character.toLowerCase('a'));

	}
}
