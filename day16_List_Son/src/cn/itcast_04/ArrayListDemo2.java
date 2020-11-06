package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：ArrayList去除集合中字符串的重复值
 * 要求：不能创建新的集合，就在以前的集合上做
 */
public class ArrayListDemo2 {
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

		// 由选择排序思想引入，我们就可以通过这种思想做这个题
		// 拿0索引的依次和后面的比较，相同就把后面的干掉
		// 同理，拿1索引的……
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;// 删除之后，下一个元素补位上来，没做判断
				}
			}
		}

		// 遍历集合
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}
}
