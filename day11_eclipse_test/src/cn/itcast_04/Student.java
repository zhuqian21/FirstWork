package cn.itcast_04;

/*
 * ��߿���Ч��
 * A:���������Զ��ṩ���췽��
 *    a:�޲ι��췽��
 *        �ڴ��������Ҽ�--source--Generate Constructors from Superclass
 *    b:���ι��췽��
 *        �ڴ��������Ҽ�--source--Generate Constructors using fields..--finish
 * B:�Զ�����get��set���� 
 *        
 * 
 */
public class Student {
	private int age;
	private String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
