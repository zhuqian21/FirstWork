package cn.itcast_04;

import java.util.Scanner;

/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ������������������ַ���
 * ������
 * 		����¼��
 * �����
 * 		��д�ַ���2��
 *		 Сд�ַ���8��
 *		 �����ַ���3��
 *
 *������
 *		A:��������ͳ�Ʊ���
 *			bigCount=0
 *			smallCount=0
 *			numberCount=0
 *		B:�����ַ������õ�ÿһ���ַ�
 *			length()��charAt()���
 *		C:�жϸ��ַ�����������������
 *			��bigCount++
 *			С��smallCount++
 *			���֣�numberCount++
 *			�����Ŀ���ѵ�������ж�ĳ���ַ��Ǵ�ģ�����С�ģ��������ֵġ�
 * 			ASCII���
 *  			0   48
 *  			A   65
 *  			a   97
 *  		���򵥵ģ�char ch = s.charAt(x);
 *	
 *			if(ch>='0' && ch<='9') numberCount++
 *			if(ch>='a' && ch<='z') smallCount++
 * 			if(ch>='A' && ch<='Z') bigCount++
 * 		D:��������
 * 
 */
public class StringScanner {
	public static void main(String[] args) {
		// ����¼���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String s = sc.nextLine();

		// ��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// �����ַ������õ�ÿһ���ַ���
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);

			// �жϸ��ַ������������������͵�
			if (ch >= '0' && ch <= '9') {
				numberCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			}
		}
		System.out.println("��д��ĸ��" + bigCount + "��");
		System.out.println("Сд��ĸ��" + smallCount + "��");
		System.out.println("���֣�" + numberCount + "��");
	}
}
