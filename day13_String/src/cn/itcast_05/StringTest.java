package cn.itcast_05;
/*
 * ���󣺰�һ���ַ�������ĸת�ɴ�д������ΪСд
 * ������
 * 		helloWORLD
 * �����
 * 		Helloworld
 * ������
 * 		A���Ȼ�ȡ��һ���ַ�
 * 		B����ȡ���˵�һ���ַ�������ַ�
 * 		C����Aת�ɴ�д
 * 		D:��Bת��Сд
 * 		E:Cƴ��D
 */
public class StringTest {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "helloWORLD";		
		//�Ȼ�ȡ��һ���ַ�
		String s1 = s.substring(0, 1);
		//��ȡ���˵�һ���ַ�������ַ�
		String s2 = s.substring(1); 
		//��s1ת�ɴ�д
		String s3 = s1.toUpperCase();
		//��s2תСд
		String s4 = s2.toLowerCase();	
		//s3ƴ��s4
		String s5 = s3.concat(s4);
		System.out.println(s5);
		
		//�Ż�
		//��ʽ���
		String result = s.substring(0,1).toUpperCase()
				.concat(s.substring(1).toLowerCase());
		System.out.println(result);
	}
}
