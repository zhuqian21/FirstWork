package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		// 测试不带All的方法

		// 创建集合对象
		// Collection c = new Collection();//错误，接口不能实例化
		Collection c = new ArrayList();

		// boolean add(Object obj):添加一个元素
		// System.out.println("add:" + c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");

		// void clear():移除所有元素
		// c.clear();

		// boolean remove(Object o):移除一个元素
		// System.out.println("remove:" + c.remove("hello"));
		// System.out.println("remove:" + c.remove("hell"));

		// boolean contains(Object o):判断集合是否包含指定的元素
		// System.out.println("contains:" + c.contains("hello"));
		// System.out.println("contains:" + c.contains("hell"));

		// boolean isEmpty():判断集合是否为空
		System.out.println("isEmpty:" + c.isEmpty());

		// int size():元素的个数
		System.out.println("size:" + c.size());
		System.out.println("c:" + c);

	}
}
