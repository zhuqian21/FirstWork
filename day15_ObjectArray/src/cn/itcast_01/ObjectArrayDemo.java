package cn.itcast_01;

/*
 * 我有5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息
 * 		学生：Student
 * 		成员变量:name,age
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx()
 * 		存储学生的数组？自己想想应该是什么样子的？
 * 分析：
 * 		A:创建学生类
 * 		B:创建学生数组(对象数组)
 * 		C:创建5个学生对象，并赋值
 * 		D:把C步骤的元素放到数组中
 * 		E:遍历学生数组
 * 		
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		// 创建学生数组(对象数组)
		Student[] students = new Student[5];

		// 创建5个学生对象，并赋值
		Student s1 = new Student("朱倩倩", 27);
		Student s2 = new Student("朱妍妍", 25);
		Student s3 = new Student("朱莲峰", 22);
		Student s4 = new Student("朱君孟", 21);
		Student s5 = new Student("慕浅", 25);

		// 把C步步骤的元素，放到数组中
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		// //循环改进
		// for(int x = 0;x<students.length;x++){
		// students[x] = s(x+1);
		// }

		// 遍历
		for (int x = 0; x < students.length; x++) {
			System.out.println(students[x]);

			// Student s = students[x];
			// System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
