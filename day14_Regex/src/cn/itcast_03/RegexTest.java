package cn.itcast_03;

import java.util.Arrays;

/*
 * ��������һ���ַ�����"91 27 46 38 50"
 * ��д����ʵ�������������ǣ�"27 38 46 50 91"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ����ָ�õ�һ���ַ�������
 * 		C:���ַ�������任��int����
 * 		D:��int��������
 * 		E:��������int��������װ��һ���ַ���
 * 		F:����ַ���
 */
public class RegexTest {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "91 27 46 38 50";
		
		//���ַ����ָ�õ�һ���ַ�������
		String[] strArray = s.split(" ");
		
		//���ַ�������任��int����
		//����һ�����鳤��
		int[] arr = new int[strArray.length];
		//�ַ�������ת���int����
		for(int x = 0;x<arr.length;x++){
			arr[x] = Integer.parseInt(strArray[x]);
		}
		
		//��int��������
		Arrays.sort(arr);
		
		//��������int��������װ��һ���ַ���
		StringBuilder sb = new StringBuilder();
		for(int x = 0;x<arr.length;x++){
			sb.append(arr[x]).append(" ");
		}
		//ת�����ַ���
		String result = sb.toString().trim();
		
		//����ַ���
		System.out.println(result);
	}
}
