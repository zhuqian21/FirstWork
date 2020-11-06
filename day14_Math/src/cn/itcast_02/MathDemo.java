package cn.itcast_02;

import java.util.Scanner;

/*
 * 需求：请设计一个方法，可以实现获取任意范围内的随机数
 * 
 * 分析：
 * 		A:键盘录入两个数据：
 * 			int start;
 * 			int end;
 * 		B:获取在start到end之间的随机数
 * 			写功能实现这个效果，得到一个随机数
 * 		C:输出这个随机数
 * 
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数据：");
		int start = sc.nextInt();
		System.out.println("请输入结束数据：");
		int end = sc.nextInt();
		for (int x = 0; x < 100; x++) {
			// 调用功能
			int num = getRandom(start, end);

			// 输出结果
			System.out.println(num);
		}
	}

	/*
	 * 写一个功能 两个明确： 返回值类型:int 参数列表:int start,int end
	 */

	public static int getRandom(int start, int end) {
		//
		//int number = (int) (Math.random() * end + start);
		
		int number = (int)(Math.random() * (end-start+1)) + start;
		return number;
	}

}
