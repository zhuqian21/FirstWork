package cn.itcast_02;
/*
 * StringBuffer的添加功能：
 * public StringBuffer append(String str):可以把任意类型添加到字符串缓冲区里面
 * public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer(); 
		
		//public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:"+sb);
		// System.out.println("sb2:"+sb2);
		// System.out.println(sb==sb2);//true
		
		//一步一步添加数据
		// sb.append("hello");
		// System.out.println("sb:"+sb);
		// sb.append("world");
		// sb.append(true);
		// sb.append(43.55);
		// sb.append(43.55f);
		
		//链式编程
		sb.append("hello").append(true).append(12).append(43.59);
		System.out.println("sb:"+sb);
		
		//public StirngBuffer insert(int offset,String str):
		sb.insert(5, "world");
		System.out.println("sb:"+sb);
	}	
}
