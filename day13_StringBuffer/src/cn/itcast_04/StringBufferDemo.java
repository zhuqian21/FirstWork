package cn.itcast_04;
/*
 * StringBuffer���滻����
 * public StringBuffer replace(int start,int end,String str):��start��ʼ��end��str�滻
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		
		//�������
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:"+sb);
		// * public StringBuffer replace(int start,int end,String str):��start��ʼ��end��str�滻
		//������Ҫ��world��������滻Ϊ"���տ���"
		sb.replace(5, 10, "���տ���");
		System.out.println("sb:"+sb);
	}
}
