package cn.itcast_03;
/*
 * StringBuffer��ɾ������
 * public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delete(int start,int end);ɾ����ָ��λ�ÿ�ʼ����ָ��λ�ý������ַ����������ر���
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//��������
		StringBuffer sb = new StringBuffer();
		//��ӹ���
		sb.append("hello").append("world").append("java");
		System.out.println("sb:"+sb);
		
		// * public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
		//������Ҫɾ��e����ַ�����ô�죿
		// sb.deleteCharAt(1);
		// System.out.println("sb:"+sb);
		// sb.deleteCharAt(1);
		// System.out.println("sb:"+sb);
		
		//* public StringBuffer delete(int start,int end);ɾ����ָ��λ�ÿ�ʼ����ָ��λ�ý������ַ����������ر���
		//������Ҫɾ��world����ַ�������ô�죿
		//sb.delete(5, 10);
		
		//������Ҫɾ�����е�����
		sb.delete(0, sb.length());
		System.out.println("sb:"+sb);
	}

}
