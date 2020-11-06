package cn.itcast_05;
/*
 * JDK5的新特性：
 * 自动装箱：把基本类型转换成包装类类型
 * 自动拆箱：把包装类类型转换成基本类型
 * 
 * 注意：
 * 		在使用时，Integer x = null; 代码会出现NullPointException
 * 		建议先判断是否为null，然后再使用
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// 定义了一个int类型的包装类类型变量i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:"+ii);
		
		//反编译：
		//Integer ii = Integer.valueOf(100);//自动装箱
		//ii = Integer>valueOf(ii.intValue()+200);//自动拆箱，再自动装箱
		System.out.println((new StringBuilder("ii:")).append(ii).toString());
		
		Integer iii = null;
		//NullPointerException
		if(iii!=null){
		iii+=1000;
		System.out.println(iii);
		}
	}
}
