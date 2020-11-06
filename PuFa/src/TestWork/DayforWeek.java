package TestWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入日期判断星期几
 * 
 * @author 朱倩
 * 
 */
public class DayforWeek {
	public static void main(String[] args) {
		System.out.println("请输入三个以内的数字，并以#结束");
		Scanner input = new Scanner(System.in);
		String str = "";
		StringBuffer sb = new StringBuffer();
		Calendar calendar = Calendar.getInstance();
		String weekd = "日一二三四五六";
		while (!(str = input.next()).equals("#")) {
			sb.append(str + ";");
		}
		String subs = sb.toString();
		String[] arr = subs.split(";");
		if (arr.length != 3) {
			System.out.println("输入数据错误！");
		} else {
			String date = arr[0] + "-" + arr[1] + "-" + arr[2];
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			Date date2 = null;
			try {
				date2 = f.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			calendar.setTime(date2);
			int day = calendar.get(Calendar.DAY_OF_WEEK);
			System.out.println("这天是星期" + weekd.substring(day - 1, day));
		}
	}
}
