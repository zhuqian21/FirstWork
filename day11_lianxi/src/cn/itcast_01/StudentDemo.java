package cn.itcast_01;
/*
 * ������  
 */
public class StudentDemo {
	public static void main(String[] args) {
		//��������
		Student s1 = new Student();
		s1.setName("������");
		s1.setAge(30);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		//��������
		Student s2 = new Student("����ϼ",27);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}
}
