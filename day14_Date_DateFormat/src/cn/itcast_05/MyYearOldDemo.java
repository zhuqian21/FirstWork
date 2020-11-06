package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 算一下你来到这个世界多长时间
 * 
 * 分析： A：键盘录入你的出生年月日 B:把该字符串转换为一个日期 C:通过该日期得到一个毫秒值 D:获取当前时间的毫秒值 E:用D-C得到一个毫秒值
 * F:把E的毫秒值转换成为年（/1000/60/60/24）
 * 
 * @author 朱倩
 * 
 */

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		// 键盘录入你的出生年月日
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日：");
		String line = sc.nextLine();

		// 把该字符串转换成为一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		// 通过该日期得到一个毫秒值
		long myTime = d.getTime();

		// 获取当前时间的毫秒值
		long nowtime = System.currentTimeMillis();

		// 用D-C得到一个毫秒值 （计算该日期和当前时间的时间差）
		long time = nowtime - myTime;

		// 把time的毫秒值转换为天
		long day = time / 1000 / 60 / 60 / 24;

		System.out.println("你来到这个世界：" + day + "天");
	}

}
