package cn.itcast_04;
/*
 * ���󣺱�����ȡ�ַ����е�ÿһ���ַ�
 * 
 * ������
 * 		A������ܹ��õ�ÿһ���ַ��أ�
 * 			char charAt(int index)
 * 		B:����ô֪���ַ������ж��ٸ��أ�
 * 			int length()
 */
public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�����ַ���
		String s ="helloworld";
		//ԭʼ�汾
		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(1));
		// System.out.println(s.charAt(9));
		
		//ѭ����
		// for(int x=0;x<10;x++){
		// System.out.println(s.charAt(x));
		// }
		
		//��K��
		for(int x=0;x<s.length();x++){
			// char ch = s.charAt(x);
			// System.out.println(ch);
			System.out.println(s.charAt(x));
		}
		
	}
}
