package cn.itcast_07;

/*
 * 统计大串中小串出现的次数
 * 举例：
 * 		在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"中java出现的次数。
 * 结果：
 * 		java出现了5次
 * 
 * 分析：
 * 		A：定义一个统计变量，初始化值为0
 * 		B：先在大串中查找一次小串第一次出现的位置
 * 			a:索引值为-1，说明小串不存在，就返回统计变量
 * 			b:索引值不是-1，说明查找到小串，统计变量++
 * 		C：把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		D：回到B
 */
public class StringTest5 {
	public static void main(String[] args) {
		// 定义大串
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		// 定义小串
		String minString = "java";

		// 功能实现
		int count = getCount(maxString, minString);
		System.out.println("java在大串中出现了:" + count + "次");
	}

	/*
	 * 两个明确： 返回值类型：int 参数列表：两个字符串
	 */
	public static int getCount(String maxString, String minString) {
		// 定义一个统计变量，初始值为0
		int count = 0;
		/*
		 * // 先在大串中查找一次小串的位置 
		 int index = maxString.indexOf(minString);
		
		 // 索引值不是-1，说明存在，统计变量++ 
		 while (index != -1) { 
		 	count++; 
		 // 把刚才的索引值加上小串的长度作为开始位置截取上一次的大串，返回一个新字符串，并把该字符串的值赋值给大串 
		 // int startIndex= index + minString.length();  
		 //maxString = maxString.substring(startIndex);
		 
		 maxString = maxString.substring(index+minString.length()); // 继续查询小串
		 index = maxString.indexOf(minString); }
		 */

		int index;
		// 先查，再赋值，最后判断
		while ((index = maxString.indexOf(minString)) != -1) {
			count++;
			maxString = maxString.substring(index+minString.length());
		}

		return count;
	}
}
