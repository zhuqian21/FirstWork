package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * 
 * 我们按照和字符串一样的操作，发现出问题了
 * 为什么？
 * 		contains()方法的底层依赖的是equals()方法。
 * 		而我们的学生类中没有equals()方法，这个时候，默认使用的是他父亲Object的equals()方法
 * 		Object()的equals()默认比较的是地址值，所以，它们进去了，因为new的东西，地址值都不同
 * 		
 * 		按照我们自己的需求，比较成员变量的值，重写equals()即可。
 *		 自动生成即可
 * 		
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("王昭君", 16);
		Student s2 = new Student("貂蝉", 19);
		Student s3 = new Student("西施", 16);
		Student s4 = new Student("赵飞燕", 16);
		Student s5 = new Student("王昭君", 16);
		Student s6 = new Student("王昭君", 26);
		Student s7 = new Student("李贵妃", 16);
		Student s8 = new Student("褒姒", 22);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		array.add(s8);

		// 创建新集合
		ArrayList newArray = new ArrayList();

		// 遍历旧集合，获取每一个元素
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			// 拿这个元素到新集合去找，有没有相同元素
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		// 遍历新集合
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
