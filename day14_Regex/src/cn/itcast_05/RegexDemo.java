package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 * 		pattern和matcher类的使用
 */
public class RegexDemo {
	public static void main(String[] args) {
		//模式和匹配器的典型调用顺序
		//把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		//通过正则表达式得到匹配对象，这个时候需要的是被匹配的字符串
		Matcher m = p.matcher("aaaab");
		//调用匹配对象的功能
		boolean b = m.matches();
		System.out.println(b);
		
		//这个判断功能，有点麻烦，我们直接用字符串的方法做
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);
		
		
	}
}
