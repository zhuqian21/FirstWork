package cn.itcast_04;
/*
 * ���õĻ�������ת��
 * public static String toBinaryString(int i)
 * public static String toOctalString(int i)
 * public static String toHexString(int i)
 * 
 * ʮ���Ƶ��������Ƶ�ת��
 * public static String toString(int i,int radix)
 * ��������ǿ����˽�ֹ�ķ�Χ��2-36����Ϊ 0~9��a~z
 * �������Ƶ�ʮ����
 * public static int parseInt(String s,int radix)
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//ʮ���Ƶ������ƣ��˽��ƣ�ʮ������
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));	
		System.out.println("---------------");
		
		//ʮ���Ƶ��������Ƶ�ת��
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, -7));
		System.out.println(Integer.toString(100, 70));
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 36));
		
		//�������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100",10));
		System.out.println(Integer.parseInt("100",2));
		System.out.println(Integer.parseInt("100",8));
		System.out.println(Integer.parseInt("100",16));
		System.out.println(Integer.parseInt("100",36));
		
		//NumberFormatException:������û��3
		//System.out.println(Integer.parseInt("123",2));
	}
}
