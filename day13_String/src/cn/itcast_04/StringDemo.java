package cn.itcast_04;

/*
 * String��Ļ�ȡ����
 * int length():��ȡ�ַ����ĳ���
 * char charAt(int index):��ȡָ������λ�õ��ַ�
 * int indexOf(int ch)������ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
 * 		Ϊʲô������int���ͣ�������char���ͣ�
 * 		ԭ���ǣ�'a'��97��ʵ���ǿ��Դ���'a'
 * int indexOf(String str):�����ַ����ڴ��ַ����е�һ�γ��ִ�������
 * int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
 * int indexOf(String str,int formIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
 * String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ
 * String substring(int start,int end)����ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		//����һ���ַ�������
		String s ="helloworld";
		
		//int length():��ȡ�ַ����ĳ��ȡ�
		System.out.println("s.length:"+s.length());
		System.out.println("-------------");
		
		//char charAt(int index)����ȡָ������λ�õ��ַ�
		System.out.println("charAt:"+s.charAt(7));
		System.out.println("-------------");
		
		//int index(int ch):����ָ���ַ��ڴ��ַ�����һ�γ��ִ�������
		System.out.println("indexOf:"+s.indexOf('l'));
		System.out.println("-------------");
		
		//int indexOf(String str):����ָ���ַ����ڴ��ַ�����һ�γ��ִ�������
		System.out.println("indexOf:"+s.indexOf("owo"));
		System.out.println("-------------");
		
		//int indexOf(int ch,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		System.out.println("indexOf:"+s.indexOf('l',3));
		System.out.println("-------------");
		
		//String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ
		//System.out.println("substring:"+s.substring(4));
		System.out.println("substring:"+s.substring(0));
		System.out.println("-------------");
		
		//String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ��������󲻰��ҡ�
		//end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���������start�������ǲ�����end����
		System.out.println("substring:"+s.substring(2,9));
		
	}
}
