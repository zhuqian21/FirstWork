package cn.itcast_07;

import java.util.Scanner;

/*
 * 把字符串反转
 */
public class StringbufferTest3 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String s = sc.nextLine();
		
		//方式1：用字符串拼接
		String s1 = myReverse(s);
		System.out.println("s1:"+s1);
		//方式2：用StringBuffer的reverse()功能
		String s2 = myReverse2(s);
		System.out.println("s2:"+s2);
	}
	
	//用StringBuffer的reverse()功能
	public static String myReverse2(String s){
		//String-转成->StringBuffer
		//方式A:
		// StringBuffer sb = new StringBuffer();
		// sb.append(s);
		//方式B:
		//StringBuffer sb = new StringBuffer(s);
		//字符串反转
		// sb.reverse();
		// return sb.toString();//转成字符串
		
		//反转简易版
		return new StringBuffer(s).reverse().toString();
	}
	
	//用String做拼接
	public static String myReverse(String s){
		String result = "";
		
		char[] chs = s.toCharArray();
		for(int x = chs.length-1;x>=0;x--){
			// char ch = chs[x];
			// result+=ch;
			result+=chs[x];
		}
		return result;
	}
}
