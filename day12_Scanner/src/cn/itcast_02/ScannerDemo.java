package cn.itcast_02;

import java.util.Scanner;

/*
 * ������ʽ��
 *      public boolean hasNextXxx();�ж��Ƿ���ĳ�����͵�Ԫ��
 *      public Xxx nextXxx():��ȡ��Ԫ��
 *      
 * ��������int���͵ķ�������
 *      public boolean hasNextInt()
 *      public int nextInt()
 * ###:
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��ȡ����
		if(sc.hasNextInt()){
		int x = sc.nextInt();
		System.out.println("x:"+x);
		}else{
			System.out.println("���������������");
		}
	}
}
