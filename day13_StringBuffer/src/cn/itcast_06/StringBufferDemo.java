package cn.itcast_06;
/*
 * StringBuffer�Ľ�ȡ����(ע�ⷵ��ֵ���Ͳ�����StringBuffer�����ˣ�����ֵ������String)
 * public String substring(int start)
 * public String substring(int start,int end)
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		
		//�������
		sb.append("hello").append("world").append("java");
		
		//��ȡ����
		//public String substring(int start) 
		String s = sb.substring(5);
		
		System.out.println("s:"+s);
		System.out.println("sb:"+sb);
		
		//public String substring(int start,int end)
		String s2 = sb.substring(5,10);
		System.out.println("s2:"+s2);
		System.out.println("sb:"+sb);
		
	}
}
