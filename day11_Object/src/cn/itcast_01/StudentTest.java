package cn.itcast_01;

/**
 * 类Object 是类层次结构的根类，每个类都使用Object作为超类
 * 每个类都直接或间接的继承自Object类
 * 
 * Object类的方法：
 *        public int hashCode():返回该对象的哈希码值。
 *           **:哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关
 * @author 朱倩
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.hashCode());
		Student student2 = new Student();
		System.out.println(student2.hashCode());
		
		Student student3 = student;
		System.out.println(student3.hashCode());
		
		System.out.println("__________");
		
		
		Student s = new Student();
		Class c= s.getClass();
		String str = c.getName();
		System.out.println(str);
		
		//链式编程
		String str2 = s.getClass().getName();
		System.out.println(str2);
		
		
		
		
		
	}
}
