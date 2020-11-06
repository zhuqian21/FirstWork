package cn.itcast_03;

import java.util.Scanner;

/*
 * 常用的两个方法：
 *       public int nextInt():获取一个int类型的值
 *       public String nextLine():获取一个String类型的值
 *           
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 获取两个int数据类型的值
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:"+a+",b:"+b);
		// System.out.println("---------");

		// //获取两个String类型的值
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// System.out.println("s1:"+s1+",s2:"+s2);
		// System.out.println("---------");

		// 先獲取一個字符串，再獲取一個int值
		// String s1 = sc.nextLine();
		// int b = sc.nextInt();
		// System.out.println("s1:" + s1 + ",b" + b);
		// System.out.println("--------");

		// 先獲取一個int值，再獲取一個字符串
		// int a = sc.nextInt();
		// String s2 = sc.nextLine();
		// System.out.println("a:" + a + ",s2:" + s2);
		// System.out.println("-------------");
		
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		System.out.println("a:"+a+",s:"+s);
	}
}
