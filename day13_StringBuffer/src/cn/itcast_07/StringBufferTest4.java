package cn.itcast_07;

import java.util.Scanner;

/*
 * �ж�һ���ַ����ǲ��ǶԳ��ַ���
 * ���磺"abc"���ǶԳ��ַ�����"aba","abba","aaa","mnanm"�ǶԳ��ַ���
 * 
 * ������
 * 		�ж�һ���ַ����Ƿ��ǶԳ��ַ�����
 * 			��һ�������һ���Ƚ�
 * 			�ڶ����͵����ڶ����Ƚ�
 * 			��
 * 		�ȽϵĴ����ǳ��ȳ���2��
 */
public class StringBufferTest4 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		//һ��һ���ıȽ�
		boolean b = isSame(s);
		System.out.println("b:"+b);
		
		//���ַ����������ķ�ת����
		boolean b2 = isSame(s);
		System.out.println("b2:"+b2);
		
	}
	
	//��ʽ2��
	public static boolean isSame2(String s){
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	
	//��ͳ��ʽ1��
	public static boolean isSame(String s){
		boolean flag = true;
		//���ַ���ת���ַ�����
		char[] chs = s.toCharArray();
		
		for(int start = 0,end = chs.length-1;start<=end;start++,end--){
			if(chs[start]!=chs[end]){
				flag=false;
				break;
			}
		}
		return flag;
	}
}
