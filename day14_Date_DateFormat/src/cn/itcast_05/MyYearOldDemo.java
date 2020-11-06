package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��һ���������������೤ʱ��
 * 
 * ������ A������¼����ĳ��������� B:�Ѹ��ַ���ת��Ϊһ������ C:ͨ�������ڵõ�һ������ֵ D:��ȡ��ǰʱ��ĺ���ֵ E:��D-C�õ�һ������ֵ
 * F:��E�ĺ���ֵת����Ϊ�꣨/1000/60/60/24��
 * 
 * @author ��ٻ
 * 
 */

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		// ����¼����ĳ���������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ��������գ�");
		String line = sc.nextLine();

		// �Ѹ��ַ���ת����Ϊһ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		// ͨ�������ڵõ�һ������ֵ
		long myTime = d.getTime();

		// ��ȡ��ǰʱ��ĺ���ֵ
		long nowtime = System.currentTimeMillis();

		// ��D-C�õ�һ������ֵ ����������ں͵�ǰʱ���ʱ��
		long time = nowtime - myTime;

		// ��time�ĺ���ֵת��Ϊ��
		long day = time / 1000 / 60 / 60 / 24;

		System.out.println("������������磺" + day + "��");
	}

}
