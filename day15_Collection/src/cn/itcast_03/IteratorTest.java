package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast_02.Student;

/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ���������
 * 
 * ע�⣺
 * 	A:�Լ���������Ҫ������ѧϰ��Ҫʹ�õ�API�е�������ͬ
 * 	B:���ƴ���ʱ�������װ��Ǹ������ڵİ�Ҳ������������׳��ֲ�����������
 * 	C:����whileѭ��д����������ܲ�����forѭ���أ�
 * 	D:��Ҫ���ʹ��it.next()��������Ϊÿ��ʹ�ö��Ƿ���һ������
 */
public class IteratorTest {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("Фս", 29);
		Student s2 = new Student("������", 25);
		Student s3 = new Student("����", 43);
		Student s4 = new Student("����", 30);
		Student s5 = new Student("����", 45);

		// ��ѧ����ӵ�������
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// ����
		Iterator it = c.iterator();// ��ʼ��
		while (it.hasNext()) {
			// System.out.println(it.next());
			// Student s = (Student) it.next();
			// System.out.println((Student) it.next().getName() + "---" +
			// (Student) it.next().getAge());

		}
		// System.out.println("---------------------");

		// forѭ����д
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// Student s = (Student) it.next();
		// System.out.println(s.getName() + "---" + s.getAge());
		// }
	}
}
