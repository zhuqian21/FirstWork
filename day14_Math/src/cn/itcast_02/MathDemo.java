package cn.itcast_02;

import java.util.Scanner;

/*
 * ���������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ������
 * 
 * ������
 * 		A:����¼���������ݣ�
 * 			int start;
 * 			int end;
 * 		B:��ȡ��start��end֮��������
 * 			д����ʵ�����Ч�����õ�һ�������
 * 		C:�����������
 * 
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ���ݣ�");
		int start = sc.nextInt();
		System.out.println("������������ݣ�");
		int end = sc.nextInt();
		for (int x = 0; x < 100; x++) {
			// ���ù���
			int num = getRandom(start, end);

			// ������
			System.out.println(num);
		}
	}

	/*
	 * дһ������ ������ȷ�� ����ֵ����:int �����б�:int start,int end
	 */

	public static int getRandom(int start, int end) {
		//
		//int number = (int) (Math.random() * end + start);
		
		int number = (int)(Math.random() * (end-start+1)) + start;
		return number;
	}

}
