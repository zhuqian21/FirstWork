package cn.itcast_02;

/*
 * system�����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * 
 * ������
 * 		public static void gc():�������ջ���
 * 		public static void exit(int status)����ֹ��ǰ�������е�JAVA�����������Ϊ״̬�룻��0״̬���ʾ�쳣�ս�
 * 		public static long currentTimeMillis():�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * 		public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length)
 */
public class SystemDemo {
	public static void main(String[] args) {
		// System.out.println("����ϲ������ϼ(��������)");
		// public static void exit(int status)
		// System.exit(0);
		// System.out.println("����Ҳϲ����ٻ(������)");

		// public static long currentTimeMillis()
		// System.out.println(System.currentTimeMillis());

		// Ҫ�����Ҹ���ͳ����γ��������ʱ��
		long start = System.currentTimeMillis();
		for (int x = 0; x < 100000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ:" + (end - start)+"����");
		// public static void arraycopy(Object src,int srcPos,object dest,int
		// destPos,int length)

	}
}
