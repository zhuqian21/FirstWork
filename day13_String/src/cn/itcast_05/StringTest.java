package cn.itcast_05;
/*
 * 需求：把一个字符串首字母转成大写，其余为小写
 * 举例：
 * 		helloWORLD
 * 结果：
 * 		Helloworld
 * 分析：
 * 		A：先获取第一个字符
 * 		B：获取除了第一个字符以外的字符
 * 		C：把A转成大写
 * 		D:把B转成小写
 * 		E:C拼接D
 */
public class StringTest {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "helloWORLD";		
		//先获取第一个字符
		String s1 = s.substring(0, 1);
		//获取除了第一个字符以外的字符
		String s2 = s.substring(1); 
		//把s1转成大写
		String s3 = s1.toUpperCase();
		//把s2转小写
		String s4 = s2.toLowerCase();	
		//s3拼接s4
		String s5 = s3.concat(s4);
		System.out.println(s5);
		
		//优化
		//链式编程
		String result = s.substring(0,1).toUpperCase()
				.concat(s.substring(1).toLowerCase());
		System.out.println(result);
	}
}
