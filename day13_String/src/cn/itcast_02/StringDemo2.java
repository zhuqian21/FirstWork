package cn.itcast_02;
/*
 * String s = new String("hello");  String s = "hello";的区别
 * 有，前者会创建2个对象，后者创建1个对象
 * ==：比较引用类型，比较的是地址值是否相同
 * equal:比较引用类型默认也是比较地址值是否相同，而String类重写了equal()方法，比较的是内容是否相同。
 */

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
