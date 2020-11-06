package cn.itcast_02;

/*
 * 创建学生类
 */
public class Student {
	// 成员变量
	private String name;
	private int age;

	// 构造方法
	public Student() {
		super();
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 成员方法
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

	// 重写toString()方法
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
