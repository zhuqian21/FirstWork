package cn.itcast_01;

import java.util.Calendar;

/**
 * 
 * @author ��ٻ
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		// �������ֶ����ɵ�ǰ���ں�ʱ���ʼ����
		Calendar rightNow = Calendar.getInstance();// �������

		// ��ȡ��
		int year = rightNow.get(Calendar.YEAR);
		// ��ȡ��
		int month = rightNow.get(Calendar.MONTH);
		// ��ȡ��
		int date = rightNow.get(Calendar.DATE);

		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
	}
}
