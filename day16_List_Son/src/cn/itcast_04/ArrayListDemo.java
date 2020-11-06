package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList去集合中除重复值
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:添加多个字符串元素（包含内容相同的）
 * 		C:创建新集合
 * 		D:遍历旧集合，获取得到每一个元素
 * 		E:拿到这个元素到新集合中去找，看有没有
 * 			有：不搭理
 * 			没有：添加到新集合
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 添加字符串对象
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");

		// 创建新集合
		ArrayList newArray = new ArrayList();

		// 遍历旧集合，获取每一个元素
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();

			// 拿这个元素到新集合去找，看看有没有这个元素
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		// 遍历新集合
		for (int x = 0; x < newArray.size(); x++) {
			String s = (String) newArray.get(x);
			System.out.println(s);
		}
	}

}
