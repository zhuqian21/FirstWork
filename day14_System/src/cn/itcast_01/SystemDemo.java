package cn.itcast_01;
/*
 * system�����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * 
 * ������
 * 		public static void gc()
 * 		public static void exit(int status)
 * 		public static long currentTimeMillis()
 * 		public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length)
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("��ٻ", 26);
		System.out.println(p);
		
		p = null;//��p����ָ�����ڴ�
		System.gc();//��̬����������ֱ�ӵ���
		
		//public static void gc()
		//public static void exit(int status)
		//public static long currentTimeMillis()
		//public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length)
		
	}
}
