package cn.itcast_02;
/*
 * Integer�Ĺ��췽��
 * public Ineger(int value)
 * public Integer(String s)
 * 		ע�⣺����ַ����������������ַ����
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//��ʽ1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:"+ii);//��дtoString,��ʱ��100����������
		
		//��ʽ2
		//String s = "100";
		//NumberFormatException
		String s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:"+iii);
	}
}
