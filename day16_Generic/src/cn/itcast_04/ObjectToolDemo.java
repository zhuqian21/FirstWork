package cn.itcast_04;

/*
 * ������Ĳ���
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		// ObjectTool ot = new ObjectTool();
		// ot.setObj(new String("��ٻ"));
		// String s = (String) ot.getObj();
		// System.out.println("�����ǣ�" + s);
		//
		// ot.setObj(new Integer(27));
		// Integer i = (Integer) ot.getObj();
		// System.out.println("�����ǣ�" + i);
		//
		// ot.setObj(new String("��ٻ2"));
		// Integer s = (Integer) ot.getObj();
		// System.out.println("�����ǣ�" + s);

		System.out.println("------------");

		ObjectTool<String> ot = new ObjectTool<String>();
		// ot.setObj(new Integer(27));//��ʱ���뱨��
		ot.setObj(new String("��ٻ"));
		String s = ot.getObj();
		System.out.println("�����ǣ�" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(27));
		Integer i = ot2.getObj();
		System.out.println("�����ǣ�" + i);

	}
}
