package cn.itcast_01;

import java.util.Date;

/*
 * Date:��ʾ�ض���˲�䣬��ȷ������
 * 
 * ���췽����
 * 		Date()�����ݵ�ǰĬ�ϵĺ���ֵ�������ڶ���
 * 		Date(long date):���ݸ����ĺ���ֵ�������ڶ���
 */
public class DateDemo {
	public static void main(String[] args) {
		//��������
		Date d = new Date();
		System.out.println("d:"+d);
		
		//��������
		//long time = System.currentTimeMillis();
		long time = 1000*60*60;//1Сʱ������������8Сʱ��
		Date d2 = new Date(time);
		System.out.println("d2:"+d2);
	}

}
