package cn.itcast_03;
/*
 * StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end);删除从指定位置开始并从指定位置结束的字符串，并返回本身
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建对象
		StringBuffer sb = new StringBuffer();
		//添加功能
		sb.append("hello").append("world").append("java");
		System.out.println("sb:"+sb);
		
		// * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
		//需求：我要删除e这个字符，怎么办？
		// sb.deleteCharAt(1);
		// System.out.println("sb:"+sb);
		// sb.deleteCharAt(1);
		// System.out.println("sb:"+sb);
		
		//* public StringBuffer delete(int start,int end);删除从指定位置开始并从指定位置结束的字符串，并返回本身
		//需求：我要删除world这个字符串，怎么办？
		//sb.delete(5, 10);
		
		//需求：我要删除所有的数据
		sb.delete(0, sb.length());
		System.out.println("sb:"+sb);
	}

}
