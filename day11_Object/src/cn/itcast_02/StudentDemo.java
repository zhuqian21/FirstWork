package cn.itcast_02;
/*
 * public String toString:返回该对象的字符串表示
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.hashCode());
		System.out.println(student.getClass().getName());
		System.out.println("--------------");
		System.out.println(student.toString());
		
		System.out.println();
	}

}
