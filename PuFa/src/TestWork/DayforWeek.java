package TestWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ���������ж����ڼ�
 * 
 * @author ��ٻ
 * 
 */
public class DayforWeek {
	public static void main(String[] args) {
		System.out.println("�������������ڵ����֣�����#����");
		Scanner input = new Scanner(System.in);
		String str = "";
		StringBuffer sb = new StringBuffer();
		Calendar calendar = Calendar.getInstance();
		String weekd = "��һ����������";
		while (!(str = input.next()).equals("#")) {
			sb.append(str + ";");
		}
		String subs = sb.toString();
		String[] arr = subs.split(";");
		if (arr.length != 3) {
			System.out.println("�������ݴ���");
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
			System.out.println("����������" + weekd.substring(day - 1, day));
		}
	}
}