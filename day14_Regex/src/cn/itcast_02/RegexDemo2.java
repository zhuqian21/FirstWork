package cn.itcast_02;

import java.util.Scanner;

/*
 * У������
 * 
 * ������
 * 		A:����¼������
 * 		B:��������Ĺ���
 * 			1517806580@qqcom
 * 			liuyi@163.com
 * 			linqingxia@126.com
 * 			fengqingyang@sina.com.cn
 * 			fqy@itcast.cn
 * 		C:���ù����жϼ���
 * 		D:������
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������˺ţ�");
		String email = sc.nextLine();
		
		//��������Ĺ���
		//String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		boolean flag = email.matches(regex);
		System.out.println("flag:"+flag);
	}

}
