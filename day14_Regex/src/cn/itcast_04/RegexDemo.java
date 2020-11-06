package cn.itcast_04;
/*
 * 替换功能
 * 		String；类的public String replaceAll(String regex,String replacement)
 *		使用给定的replacement替换此字符串所有匹配给定的郑则表达式的子字符串
 *
 */
public class RegexDemo {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "helloqq12345world622112345678java";
		
		//我要去除所有的数字，用*给替换掉
		//String regex = "\\d+";
		String regex = "\\d";
		//String ss = "*";
		String ss = "";
		
		String result = s.replaceAll(regex,ss);
		System.out.println(result);
	}
}
