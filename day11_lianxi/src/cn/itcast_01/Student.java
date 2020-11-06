package cn.itcast_01;

public class Student {
	// 姓名
	private String name;
	// 年龄
	private int age;
	//alt+shift+s+o 带参构造方法 
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	////alt+shift+s+c 无参构造方法 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	////alt+shift+s+r get/set方法 
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
		System.out.println("姓名："+name+",年龄："+age);
	}
	
}
