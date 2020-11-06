package cn.itcast_01;

public class Person {
	private String name;
	private int age;
	
	//Alt+Shift+s+c
	public Person() {
		super();
	}
	
	//Alt+Shift+s+o
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Alt+Shift+s+r
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
	
	//Alt+Shift+s+s:��дtoString����
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ǰ�Ķ��󱻻�����"+this);//�ͷ��Լ���
		super.finalize();//�ͷŸ��׵�
	}
}
