package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");

		// Object get(int index):获取指定位置的元素
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
		// System.out.println(list.get(3));//IndexOutOfBoundsException

		// 循环改进
		// for (int x = 0; x < 3; x++) {
		// System.out.println(list.get(x));
		// }

		// 最终版本：size()方法和get()方法的结合
		for (int x = 0; x < list.size(); x++) {
			// System.out.println(list.get(x));

			String s = (String) list.get(x);
			System.out.println(s);
		}

	}
}
