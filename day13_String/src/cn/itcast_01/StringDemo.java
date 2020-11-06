package cn.itcast_01;
/*
 * �ַ����������ɶ���ַ���ɵ�һ�����ݣ�Ҳ���Կ�����һ���ַ�����
 * ͨ���鿴API�����ǿ���֪��
 *      A���ַ�������ֵ��abc��Ҳ���Կ���һ���ַ�������
 *      B���ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı䡣
 *      
 * ���췽����
 *    public String():�ո�
 *    public String(byte[] bytes):���ֽ�����ת�����ַ���
 *    public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
 *    public String(char[] value):���ַ�����ת�����ַ���
 *    public String(char[] vlaue,int index,int count):���ַ������һ����ת�����ַ���
 *    public String(String original)�����ַ�������ֵת���ַ���
 *    
 *    �ַ����ķ���
 *       public int length():���ش��ַ����ĳ���
 */
public class StringDemo {
	public static void main(String[] args) {
		//public String();  //�չ���
		String s1 = new String();
		System.out.println("s1:"+s1);//toString()
		System.out.println("s1.length():"+s1.length());
		System.out.println("-------------");
		
		//public String(byte[] bytes):���ֽ�����ת�����ַ���
		byte[] bys = {97,98,99,100,101};
		String s2 = new String(bys);
		System.out.println("s2:"+s2);
		System.out.println("s2.length():"+s2.length());
		System.out.println("-----------");
		
		//public String(byte[] bytes,int index,int length):���ֽ�����Ĳ���ת�����ַ���
		//����Ҫ�õ��ַ�����bcd��
		String s3 = new String(bys,1,3);
		System.out.println("s3:"+s3);
		System.out.println("s3.length:"+s3.length());
		
		//public String(char[] value):���ַ�����ת�����ַ���
		char[] chs = {'a','b','c','d','e','��','ٻ'};
		String s4 = new String(chs);
		System.out.println("s4:"+s4);
		System.out.println("s4.length():"+s4.length());
		System.out.println("----------------");
		
		//public String(char[] value,int index,int count):���ַ������鲿��ת�����ַ���
		String s5 = new String(chs,2,4);
		System.out.println("s5:"+s5);
		System.out.println("s5.length():"+s5.length());
	}
}
