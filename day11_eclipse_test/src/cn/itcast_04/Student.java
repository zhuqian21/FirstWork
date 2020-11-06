package cn.itcast_04;

/*
 * 提高开发效率
 * A:帮助我们自动提供构造方法
 *    a:无参构造方法
 *        在代码区域右键--source--Generate Constructors from Superclass
 *    b:带参构造方法
 *        在代码区域右键--source--Generate Constructors using fields..--finish
 * B:自动生成get和set方法 
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
