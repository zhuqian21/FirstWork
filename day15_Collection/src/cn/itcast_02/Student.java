package cn.itcast_02;

/*
 * ����ѧ����
 */
public class Student {
	// ��Ա����
	private String name;
	private int age;

	// ���췽��
	public Student() {
		super();
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ��Ա����
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

	// ��дtoString()����
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
