package cn.itcast_01;

public class Student {
	// ����
	private String name;
	// ����
	private int age;
	//alt+shift+s+o ���ι��췽�� 
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	////alt+shift+s+c �޲ι��췽�� 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	////alt+shift+s+r get/set���� 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("������"+name+",���䣺"+age);
	}
	
}
