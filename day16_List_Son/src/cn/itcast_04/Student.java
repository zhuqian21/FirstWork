package cn.itcast_04;

public class Student {
	private String name;
	private int age;

	// (Alt+Shift+s+c)
	public Student() {
		super();
	}

	// 构造方法(Alt+Shift+s+o)
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 成员方法(Alt+Shift+s+r)
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// 重写toString()方法(Alt+Shift+)
	// @Override
	// public String toString() {
	// return "Student [name=" + name + ", age=" + age + "]";
	// }

}
