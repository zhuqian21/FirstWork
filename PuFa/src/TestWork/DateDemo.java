package TestWork;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat d = DateFormat.getDateInstance();
		String str = d.format(now);
		Date date1 = new Date();
		int week = date1.getDay(); // �ѹ�ʱ����Calendar.get(Calendar.DAY_OF_WEEK)ȡ��
		int day = date1.getDate(); // �ѹ�ʱ����Calendar.get(Calendar.DAY_OF_MONTH)ȡ��
		int month = date1.getMonth();// �ѹ�ʱ����Calendar.get(Calendar.MONTH)ȡ��
		int year = date1.getYear() + 1900; // �ѹ�ʱ����Calendar.get(Calendar.YEAR)ȡ��
		char ch;
		switch (week) {
		case 1:
			ch = 'һ';
			break;
		case 2:
			ch = '��';
			break;
		case 3:
			ch = '��';
			break;
		case 4:
			ch = '��';
			break;
		case 5:
			ch = '��';
			break;
		case 6:
			ch = '��';
			break;
		case 7:
			ch = '��';
			break;
		default:
			ch = 'һ';
			break;
		}
		System.out.println("������" + year + "��" + month + "��" + day + "������"
				+ week);
		System.out.println("������" + str);
	}
}
