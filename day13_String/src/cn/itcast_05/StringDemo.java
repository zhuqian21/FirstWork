package cn.itcast_05;

/*
 * String��ת������
 * byte[] getBytes():���ַ���ת�����ֽ�����
 * char[] toCharArray()�����ַ���ת�����ַ�����
 * static String valueOf(char[] chs)�����ַ�����ת�����ַ���
 * static String valueOf(int i)
 * 		ע�⣺String���valueOf�������԰��������͵�����ת���ַ���
 * String toLowerCase()�����ַ���ת��Сд
 * String toUpperCase()�����ַ���ת�ɴ�д
 * Stringconcat(String str)�����ַ���ƴ��
 */
public class StringDemo {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "JavaSE";

		// byte[] getBytes():���ַ���ת�����ֽ�����
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.println(bys[x]);
		}
		System.out.println("--------------");

		// char[] toCharArray()�����ַ���ת�����ַ�����
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("--------------");

		// static String valueOf(char[] chs)�����ַ�����ת�����ַ���
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("--------------");

		// static String valueOf(int i):��int���͵�����ת�����ַ���
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("--------------");

		// String toLowerCase()�����ַ���ת��Сд
		// ����һ���µĴ�
		System.out.println("toLowerCase��" + s.toLowerCase());
		System.out.println(s);
		System.out.println("--------------");

		// String toUpperCase()�����ַ���ת�ɴ�д
		System.out.println("toUpperCase:" + s.toUpperCase());
		System.out.println("--------------");

		// Stringconcat(String str)�����ַ���ƴ��
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		
	}
}
