package cn.itcast_02;
/*
 * StringBuffer����ӹ��ܣ�
 * public StringBuffer append(String str):���԰�����������ӵ��ַ�������������
 * public StringBuffer insert(int offset,String str):��ָ��λ�ð��������͵����ݲ��뵽�ַ������������棬�������ַ�������������
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer(); 
		
		//public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:"+sb);
		// System.out.println("sb2:"+sb2);
		// System.out.println(sb==sb2);//true
		
		//һ��һ���������
		// sb.append("hello");
		// System.out.println("sb:"+sb);
		// sb.append("world");
		// sb.append(true);
		// sb.append(43.55);
		// sb.append(43.55f);
		
		//��ʽ���
		sb.append("hello").append(true).append(12).append(43.59);
		System.out.println("sb:"+sb);
		
		//public StirngBuffer insert(int offset,String str):
		sb.insert(5, "world");
		System.out.println("sb:"+sb);
	}	
}
