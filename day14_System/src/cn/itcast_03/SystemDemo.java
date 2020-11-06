package cn.itcast_03;

import java.util.Arrays;

/*
 * system类包含一些有用的类字段和方法，它不能被实例化。
 * 
 * 方法：
 * 		public static void gc():垃圾回收机制
 * 		public static void exit(int status)：终止当前正在运行的JAVA虚拟机参数作为状态码；非0状态码表示异常终结
 * 		public static long currentTimeMillis():返回以毫秒为单位的当前时间
 * 		public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length):
 * 		从指定源数组(src)中复制一个数组，复制从指定的位置(srcPos)开始，到目标数组(dest)的指定位置(destPos)结束
 *		src:源数组
 *		srcPos:源数组中的起始位置
 *		dest:目标数组
 *		destPos:目标数组中的起始位置
 *		length:要复制的数组元素的数量
 */
public class SystemDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {11,22,33,44,55};
		int[] arr2 = {6,7,8,9,10};
		System.arraycopy(arr, 1, arr2, 2, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
