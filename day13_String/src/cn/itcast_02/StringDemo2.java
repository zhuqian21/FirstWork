package cn.itcast_02;
/*
 * String s = new String("hello");  String s = "hello";������
 * �У�ǰ�߻ᴴ��2�����󣬺��ߴ���1������
 * ==���Ƚ��������ͣ��Ƚϵ��ǵ�ֵַ�Ƿ���ͬ
 * equal:�Ƚ���������Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String����д��equal()�������Ƚϵ��������Ƿ���ͬ��
 */

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
