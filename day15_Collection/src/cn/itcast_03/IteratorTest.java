package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast_02.Student;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历
 * 
 * 注意：
 * 	A:自己的类名不要和我们学习的要使用的API中的类名相同
 * 	B:复制代码时，很容易把那个类所在的包也导入过来，容易出现不能理解的问题
 * 	C:能用while循环写这个程序，我能不能用for循环呢？
 * 	D:不要多次使用it.next()方法，因为每次使用都是访问一个对象
 */
public class IteratorTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("肖战", 29);
		Student s2 = new Student("陈美琪", 25);
		Student s3 = new Student("何炅", 43);
		Student s4 = new Student("李沁", 30);
		Student s5 = new Student("康辉", 45);

		// 把学生添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 遍历
		Iterator it = c.iterator();// 初始化
		while (it.hasNext()) {
			// System.out.println(it.next());
			// Student s = (Student) it.next();
			// System.out.println((Student) it.next().getName() + "---" +
			// (Student) it.next().getAge());

		}
		// System.out.println("---------------------");

		// for循环改写
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// Student s = (Student) it.next();
		// System.out.println(s.getName() + "---" + s.getAge());
		// }
	}
}
