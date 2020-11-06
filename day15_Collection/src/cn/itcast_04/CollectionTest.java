package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:创建字符串对象
 * 		C:把字符串对象添加到集合中
 * 		D:遍历集合
 */
public class CollectionTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建字符串对象
		// 把字符串对象添加到集合中
		c.add("肖战");
		c.add("是");
		c.add("浅浅");
		c.add("的");
		c.add("大星儿");

		// 遍历集合
		// 1.通过集合对象获取迭代器对象
		Iterator it = c.iterator();
		// 2.通过迭代器对象的hasNext()方法判断有没有
		while (it.hasNext()) {
			// 3.通过迭代器对象的next()方法获取元素
			String s = (String) it.next();
			System.out.println(s + "---" + s.length());
		}
	}
}
