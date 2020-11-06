package cn.itcast_04;

/*
 * 泛型类的测试
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		// ObjectTool ot = new ObjectTool();
		// ot.setObj(new String("朱倩"));
		// String s = (String) ot.getObj();
		// System.out.println("姓名是：" + s);
		//
		// ot.setObj(new Integer(27));
		// Integer i = (Integer) ot.getObj();
		// System.out.println("年龄是：" + i);
		//
		// ot.setObj(new String("朱倩2"));
		// Integer s = (Integer) ot.getObj();
		// System.out.println("姓名是：" + s);

		System.out.println("------------");

		ObjectTool<String> ot = new ObjectTool<String>();
		// ot.setObj(new Integer(27));//此时编译报错
		ot.setObj(new String("朱倩"));
		String s = ot.getObj();
		System.out.println("姓名是：" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(27));
		Integer i = ot2.getObj();
		System.out.println("年龄是：" + i);

	}
}
