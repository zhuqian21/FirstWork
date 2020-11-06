package cn.itcast_01;
/*
 * system类包含一些有用的类字段和方法，它不能被实例化。
 * 
 * 方法：
 * 		public static void gc()
 * 		public static void exit(int status)
 * 		public static long currentTimeMillis()
 * 		public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length)
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("朱倩", 26);
		System.out.println(p);
		
		p = null;//让p不再指定堆内存
		System.gc();//静态方法，可以直接调用
		
		//public static void gc()
		//public static void exit(int status)
		//public static long currentTimeMillis()
		//public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length)
		
	}
}
