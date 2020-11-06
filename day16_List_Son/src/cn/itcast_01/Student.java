package cn.itcast_01;

public class Student {
	private String name;
	private int age;

	// Alt+Shift+C
	public Student() {
		super();
	}

	// Alt+Shift+O
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Alt+shift+R
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

	// Alt+Shift+S
	// @Override
	// public String toString() {
	// return "Student [name=" + name + ", age=" + age + "]";
	// }

}
