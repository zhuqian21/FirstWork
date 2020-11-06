package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储字符串并遍历
 * 
 * 报错原因：存储时，存储了两种类型的数据String和Integer
 * 		     而在遍历的时候，我们把它们当作String类型处理的，做了转换，所以就报错了
 * 		     但是，它在编译期间却没有告诉我们
 * 所以我觉得这个设计不好
 * 回想数组的设计：
 * 		String[] strArray = new String[3];
 * 		strArray[0] = "hello";
 * 		strArray[1] = "world";
 * 		strArray[2] = 10;
 * 
 * 集合也模仿着数组的这种做法，在创建的时候明确缘故是的数据类型，这样就不会再有问题了。也被称为参数化类型(把类型当作参数一样传递)。
 * 
 * 泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型
 * 格式：
 * 		<数据类型>：此处的数据类型只能是引用类型。
 * 好处：
 * 		A:把运行时期的问题提前到了编译时期
 * 		B:避免了强制类型转换
 * 		C:优化的程序设计，解决了黄色警告线
 */
public class GenericDemo {
	public static void main(String[] args) {
		// 创建集合
		ArrayList<String> array = new ArrayList<String>();

		// 添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(new Integer(100));
		// array.add(10); // JDK5以后自动装箱,等价于：array.add(Integer.ValueOf(10));

		// 遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// ClassCastException
			// String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}

		// String[] strArray = new String[3];
		// strArray[0] = "hello";
		// strArray[1] = "world";
		// // strArray[2] = 10;//直接报错
	}
}
