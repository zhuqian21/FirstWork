package cn.itcast_02;

/*
 * system类包含一些有用的类字段和方法，它不能被实例化。
 * 
 * 方法：
 * 		public static void gc():垃圾回收机制
 * 		public static void exit(int status)：终止当前正在运行的JAVA虚拟机参数作为状态码；非0状态码表示异常终结
 * 		public static long currentTimeMillis():返回以毫秒为单位的当前时间
 * 		public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length)
 */
public class SystemDemo {
	public static void main(String[] args) {
		// System.out.println("我们喜欢林青霞(东方不败)");
		// public static void exit(int status)
		// System.exit(0);
		// System.out.println("我们也喜欢朱倩(白娘子)");

		// public static long currentTimeMillis()
		// System.out.println(System.currentTimeMillis());

		// 要求：请大家给我统计这段程序的运行时间
		long start = System.currentTimeMillis();
		for (int x = 0; x < 100000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时:" + (end - start)+"毫秒");
		// public static void arraycopy(Object src,int srcPos,object dest,int
		// destPos,int length)

	}
}
