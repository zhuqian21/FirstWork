package cn.itcast_01;

/*
 *由于在运算的时候，float类型和double很容易丢失精度，为了能精确的表示、计算浮点数，提供了BigDecimal 
 *BigDecimal类概述：不可变的、任意精度的有符号的十进制数，可以解决数据丢失问题
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);//0.09999999999999999
		System.out.println(1.0 - 0.32);//0.6799999999999999
		System.out.println(1.015 * 100);//101.49999999999999
		System.out.println(1.301 / 100);//0.013009999999999999
		
		System.out.println(1.0-0.12);
	}
}
