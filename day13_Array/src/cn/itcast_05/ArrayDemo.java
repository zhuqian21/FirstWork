package cn.itcast_05;

import java.util.Arrays;

/*
 * Arrays:针对数组进行操作的工具类，比如排序和查找。
 * 1:public static String toString(int[] a):把数组转成字符串
 * 2:public static void sort(int[] a):对数组进行排序
 * 3:public static int binarySearch(int[] a,int key):二分查找
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};
		
		System.out.println("排序前binarySearch:"+Arrays.binarySearch(arr, 80));
		//1:public static String toString(int[] a):把数组转成字符串
		System.out.println("排序前："+Arrays.toString(arr));//通过类名直接调方法
		
		//2:public static void sort(int[] a):对数组进行排序
		Arrays.sort(arr);//底层用的快速排序
		System.out.println("排序后:"+Arrays.toString(arr));
		
		//3:public static int binarySearch(int[] a,int key):二分查找
		System.out.println("查找元素所在的索引："+Arrays.binarySearch(arr, 388));
	}
}
