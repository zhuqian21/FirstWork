package cn.itcast_07;

/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"��java���ֵĴ�����
 * �����
 * 		java������5��
 * 
 * ������
 * 		A������һ��ͳ�Ʊ�������ʼ��ֵΪ0
 * 		B�����ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			a:����ֵΪ-1��˵��С�������ڣ��ͷ���ͳ�Ʊ���
 * 			b:����ֵ����-1��˵�����ҵ�С����ͳ�Ʊ���++
 * 		C���Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D���ص�B
 */
public class StringTest5 {
	public static void main(String[] args) {
		// �����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		// ����С��
		String minString = "java";

		// ����ʵ��
		int count = getCount(maxString, minString);
		System.out.println("java�ڴ��г�����:" + count + "��");
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�int �����б������ַ���
	 */
	public static int getCount(String maxString, String minString) {
		// ����һ��ͳ�Ʊ�������ʼֵΪ0
		int count = 0;
		/*
		 * // ���ڴ��в���һ��С����λ�� 
		 int index = maxString.indexOf(minString);
		
		 // ����ֵ����-1��˵�����ڣ�ͳ�Ʊ���++ 
		 while (index != -1) { 
		 	count++; 
		 // �Ѹղŵ�����ֵ����С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ�����ַ��������Ѹ��ַ�����ֵ��ֵ���� 
		 // int startIndex= index + minString.length();  
		 //maxString = maxString.substring(startIndex);
		 
		 maxString = maxString.substring(index+minString.length()); // ������ѯС��
		 index = maxString.indexOf(minString); }
		 */

		int index;
		// �Ȳ飬�ٸ�ֵ������ж�
		while ((index = maxString.indexOf(minString)) != -1) {
			count++;
			maxString = maxString.substring(index+minString.length());
		}

		return count;
	}
}
