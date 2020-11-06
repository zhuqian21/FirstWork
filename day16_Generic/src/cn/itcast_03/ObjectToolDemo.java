package cn.itcast_03;

/*
 * 早期时，我们使用Object来代表任意的类型
 * 向上转型没有问题，但是向下转型的时候有问题
 * 所以在JDK5后引入泛型，提高程序的安全性
 * 
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		ot.setObj(new Integer(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("年龄是：" + i);

		ot.setObj(new String("林青霞"));
		String s = (String) ot.getObj();
		System.out.println("姓名是：" + s);
		System.out.println("-----------------");

		ot.setObj(new Integer(27));
		String ss = (String) ot.getObj();
		System.out.println("年龄是：" + i);
	}
}
