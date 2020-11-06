package cn.itcast_04;

/*
 * String类的获取功能
 * int length():获取字符串的长度
 * char charAt(int index):获取指定索引位置的字符
 * int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引
 * 		为什么这里是int类型，而不是char类型？
 * 		原因是：'a'和97其实都是可以代表'a'
 * int indexOf(String str):返回字符串在此字符串中第一次出现处的索引
 * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
 * int indexOf(String str,int formIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
 * String substring(int start):从指定位置开始获取字符串，默认到末尾
 * String substring(int start,int end)：从指定位置开始到指定位置结束获取字符串
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		//定义一个字符串对象
		String s ="helloworld";
		
		//int length():获取字符串的长度。
		System.out.println("s.length:"+s.length());
		System.out.println("-------------");
		
		//char charAt(int index)：获取指定索引位置的字符
		System.out.println("charAt:"+s.charAt(7));
		System.out.println("-------------");
		
		//int index(int ch):返回指定字符在此字符串第一次出现处的索引
		System.out.println("indexOf:"+s.indexOf('l'));
		System.out.println("-------------");
		
		//int indexOf(String str):返回指定字符串在此字符串第一次出现处的索引
		System.out.println("indexOf:"+s.indexOf("owo"));
		System.out.println("-------------");
		
		//int indexOf(int ch,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
		System.out.println("indexOf:"+s.indexOf('l',3));
		System.out.println("-------------");
		
		//String substring(int start):从指定位置开始获取字符串，默认到末尾
		//System.out.println("substring:"+s.substring(4));
		System.out.println("substring:"+s.substring(0));
		System.out.println("-------------");
		
		//String substring(int start,int end):从指定位置开始到指定位置结束获取字符串，包左不包右。
		//end):从指定位置开始到指定位置结束获取字符串，包括start索引但是不包括end索引
		System.out.println("substring:"+s.substring(2,9));
		
	}
}
