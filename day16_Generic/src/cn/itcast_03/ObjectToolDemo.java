package cn.itcast_03;

/*
 * ����ʱ������ʹ��Object���������������
 * ����ת��û�����⣬��������ת�͵�ʱ��������
 * ������JDK5�����뷺�ͣ���߳���İ�ȫ��
 * 
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		ot.setObj(new Integer(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("�����ǣ�" + i);

		ot.setObj(new String("����ϼ"));
		String s = (String) ot.getObj();
		System.out.println("�����ǣ�" + s);
		System.out.println("-----------------");

		ot.setObj(new Integer(27));
		String ss = (String) ot.getObj();
		System.out.println("�����ǣ�" + i);
	}
}
