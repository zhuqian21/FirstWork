package cn.itcast_01;

/*
 *�����������ʱ��float���ͺ�double�����׶�ʧ���ȣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡�������ṩ��BigDecimal 
 *BigDecimal����������ɱ�ġ����⾫�ȵ��з��ŵ�ʮ�����������Խ�����ݶ�ʧ����
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
