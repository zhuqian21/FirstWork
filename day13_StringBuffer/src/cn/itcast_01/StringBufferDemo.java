package cn.itcast_01;
/*
 * �̰߳�ȫ�������߳̽��⣩
 * ��ȫ--ͬ��--������ʱ����˲�����--�����ǰ�ȫ��
 * ����ȫ--��ͬ��--Ч�ʸ�һЩ
 * ��ȫ��Ч��������Զ����������
 * ��ȫ��ҽԺ����վ��������վ
 * Ч�ʣ�������վ����̳��
 * 
 * StringBuffer:
 * 		�̰߳�ȫ�Ŀɱ��ַ���
 * StringBuffer��String����
 * ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ�
 * ���ʹ��ǰ�߿����ַ�����ƴ�ӣ������˷�̫�����Դ��
 * 
 * StringBuffer�Ĺ��췽����
 * 		public StringBuffer():�޲ι��췽��
 * 		public StringBuffer(int capacity)��
 * 		public StringBuffer(String str)
 * 
 * StringBuffer�ķ�����
 * 		public int capacity():���ص�ǰ������
 * 		public int length():���س��ȣ��ַ�������ʵ��ֵ
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//public StringBuffer():�޲ι��췽��
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:"+sb);
		System.out.println("sb:"+sb.capacity());
		System.out.println("sb:"+sb.length());
		System.out.println("-----------------");
		
		//public StringBuffer(String str):ָ���������ַ�������������
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:"+sb2);
		System.out.println("sb2.capacity():"+sb2.capacity());
		System.out.println("sb2.length():"+sb2.length());
		System.out.println("-----------------");
		
		//public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:"+sb3);
		System.out.println("sb3.capacity():"+sb3.capacity());
		System.out.println("sb3.length():"+sb3.length());
		System.out.println("-----------------");
	}
}