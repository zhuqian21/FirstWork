package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历
 * 
 * 分析：
 * A：创建学生类
 * B：创建集合对象
 * C：创建学生对象
 * D：把学生添加到集合
 * E：把集合转成数组
 * F：遍历数组
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("肖战", 29);
		Student s2 = new Student("陈美琪", 25);
		Student s3 = new Student("何炅", 43);
		Student s4 = new Student("李沁", 30);
		Student s5 = new Student("康辉", 45);

		// 把学生添加到集合
		c.add(s1); // 向上转型
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 把集合转成数组
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			// System.out.println(objs[x]);

			Student s = (Student) objs[x];// 向下转型
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
