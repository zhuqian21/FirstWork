package cn.itcast_07;

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼��"abc"
 * ��������"cba"
 * 
 * ������
 * 		A������¼��һ���ַ���
 * 		B������һ�����ַ���
 * 		C�����ű����ַ������õ�ÿһ���ַ�
 * 			������ʽ��
 * 			a:length()��charAt()���
 * 			b:���ַ���ת���ַ�����
 * 		D�������ַ�����ÿһ���ַ�ƴ������
 *		E��������ַ��� 
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();
		/*
		// ����һ���µ��ַ���
		String result = "";

		// ���ַ���ת���ַ�����
		char[] chs = line.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--) {
			// �����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}
		
		// �����ת������ַ���
		System.out.println("��ת������ַ�����" + result);
		*/
		
		
		// �Ľ���Ĺ���ʵ��
		String result = myReverse(line);
		System.out.println("ʵ�ֹ��ܺ�Ľ���ǣ�"+result);

	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�String �����б�String
	 */
	public static String myReverse(String line) {
		// ����һ���µ��ַ���
		String result = "";

		// ���ַ���ת���ַ�����
		char[] chs = line.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--) {
			// �����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}
		return result;
	}

}
