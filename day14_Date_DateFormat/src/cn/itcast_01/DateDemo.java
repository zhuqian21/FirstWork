package cn.itcast_01;

import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒
 * 
 * 构造方法：
 * 		Date()：根据当前默认的毫秒值创建日期对象
 * 		Date(long date):根据给定的毫秒值创建日期对象
 */
public class DateDemo {
	public static void main(String[] args) {
		//创建对象
		Date d = new Date();
		System.out.println("d:"+d);
		
		//创建对象
		//long time = System.currentTimeMillis();
		long time = 1000*60*60;//1小时（东八区，差8小时）
		Date d2 = new Date(time);
		System.out.println("d2:"+d2);
	}

}
