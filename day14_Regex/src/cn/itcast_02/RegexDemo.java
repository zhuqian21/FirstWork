package cn.itcast_02;

import java.util.Scanner;

/*
 * �жϹ���
 * 		String���public boolean matches(String regex)
 * 
 * ����
 * 		�ж��ֻ������Ƿ�����Ҫ��
 * 
 * ������
 * 		A:����¼���ֻ�����
 * 		B:�����ֻ��ŵĹ���
 *  		13436975980
 * 			13688886868
 * 			13866668888
 * 			13456789012
 * 			13123456789
 * 			18638833883
 * 			18886867878
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		//����¼���ֻ���
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ��ţ�");
		String phone = sc.nextLine();
		
		//�����ֻ�����Ĺ���
		String regex = "1[38]\\d{9}";
		
		//���ù��ܣ��жϼ���
		Boolean flag = phone.matches(regex);
		
		//������
		System.out.println("flag:"+flag);
		
	}
}
