package cn.itcast_04;
/*
 * 需求：遍历获取字符串中的每一个字符
 * 
 * 分析：
 * 		A：如何能够拿到每一个字符呢？
 * 			char charAt(int index)
 * 		B:我怎么知道字符到底有多少个呢？
 * 			int length()
 */
public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//定义字符串
		String s ="helloworld";
		//原始版本
		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(1));
		// System.out.println(s.charAt(9));
		
		//循环版
		// for(int x=0;x<10;x++){
		// System.out.println(s.charAt(x));
		// }
		
		//最終版
		for(int x=0;x<s.length();x++){
			// char ch = s.charAt(x);
			// System.out.println(ch);
			System.out.println(s.charAt(x));
		}
		
	}
}
