package cn.itcast_03;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ������������������ַ���
 * ������
 * 		A:��������ͳ�Ʊ���
 * 			int bigCount=0;
 * 			int smalCount=0;
 * 			int numberCount=0;
 * 		B:����¼��һ���ַ���
 * 		C:���ַ���ת�����ַ�����
 * 		D:�����ַ������ȡ��ÿһ���ַ�
 * 		E:�ж��ַ���
 * 			��д    bigCount++;
 * 			Сд	smallCount++;
 * 			����	numberCount++;
 * 		F:����������
 * 
 */
public class CharacterTest {
	public static void main(String[] args) {
		//��������ͳ�Ʊ���
		int BigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();
		
		//���ַ���ת���ַ�����
		char[] chs = line.toCharArray();
		
		//�����ַ������ȡ��ÿһ���ַ�
		for(int x = 0;x<chs.length;x++){
			char ch = chs[x];
			
			//�жϸ��ַ�
			if(Character.isUpperCase(ch)){
				BigCount++;
			}else if(Character.isLowerCase(ch)){
				smallCount++;
			}else if(Character.isDigit(ch)){
				numberCount++;
			}
		}
		
		//������
		System.out.println("��д��ĸ��"+BigCount+"��");
		System.out.println("Сд��ĸ��"+smallCount+"��");
		System.out.println("�����ַ���"+numberCount+"��");

	}
}
