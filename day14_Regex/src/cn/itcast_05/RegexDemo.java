package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 * 		pattern��matcher���ʹ��
 */
public class RegexDemo {
	public static void main(String[] args) {
		//ģʽ��ƥ�����ĵ��͵���˳��
		//��������ʽ�����ģʽ����
		Pattern p = Pattern.compile("a*b");
		//ͨ��������ʽ�õ�ƥ��������ʱ����Ҫ���Ǳ�ƥ����ַ���
		Matcher m = p.matcher("aaaab");
		//����ƥ�����Ĺ���
		boolean b = m.matches();
		System.out.println(b);
		
		//����жϹ��ܣ��е��鷳������ֱ�����ַ����ķ�����
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);
		
		
	}
}
