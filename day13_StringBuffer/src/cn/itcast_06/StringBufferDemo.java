package cn.itcast_06;
/*
 * StringBuffer的截取功能(注意返回值类型不再是StringBuffer本身了，返回值类型是String)
 * public String substring(int start)
 * public String substring(int start,int end)
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//添加数据
		sb.append("hello").append("world").append("java");
		
		//截取功能
		//public String substring(int start) 
		String s = sb.substring(5);
		
		System.out.println("s:"+s);
		System.out.println("sb:"+sb);
		
		//public String substring(int start,int end)
		String s2 = sb.substring(5,10);
		System.out.println("s2:"+s2);
		System.out.println("sb:"+sb);
		
	}
}
