package cn.itcast_02;
/*
 * public static boolean isUpperCase(char ch):�жϸ������ַ��ǲ��Ǵ�д�ַ�
 * public static boolean isLowerrCase(char ch)���жϸ������ַ��ǲ���Сд�ַ�
 * public static boolean isDigit(char ch)���жϸ������ַ��ǲ��������ַ�
 * public static char toUpperCase(char ch)���Ѹ������ַ�ת���ɴ�д�ַ�
 * public static char toLowerCase(char ch)���Ѹ������ַ�ת����Сд�ַ�
 */
public class CharacterDemo {
	public static void main(String[] args) {
		//public static boolean isUpperCase(char ch):�жϸ������ַ��ǲ��Ǵ�д�ַ�
		
		//��̬������ֱ������������
		System.out.println("isUpperCase:"+Character.isUpperCase('A'));
		System.out.println("isUpperCase:"+Character.isUpperCase('a'));
		System.out.println("isUpperCase:"+Character.isUpperCase('0'));
		
		//public static boolean isLowerrCase(char ch)���жϸ������ַ��ǲ���Сд�ַ�

		System.out.println("isLowerCase:"+Character.isLowerCase('A'));
		System.out.println("isLowerCase:"+Character.isLowerCase('a'));
		System.out.println("isLowerCase:"+Character.isLowerCase('0'));
		
		//public static boolean isDigit(char ch)���жϸ������ַ��ǲ��������ַ�

		System.out.println("isDigit:"+Character.isDigit('A'));
		System.out.println("isDigit:"+Character.isDigit('a'));
		System.out.println("isDigit:"+Character.isDigit('0'));
		
		//public static char toUpperCase(char ch)���Ѹ������ַ�ת���ɴ�д�ַ�
		System.out.println("toUpperCase:"+Character.toUpperCase('A'));
		System.out.println("toUpperCase:"+Character.toUpperCase('a'));
		
		//public static char toLowerCase(char ch)���Ѹ������ַ�ת����Сд�ַ�
		System.out.println("toLowerCase:"+Character.toLowerCase('A'));
		System.out.println("toLowerCase:"+Character.toLowerCase('a'));

	}
}
