package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴����Զ�����󲢱���Student(name,age)
 * 
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:����ѧ������
 * 		D:��ѧ��������ӵ����϶�����
 * 		E:��������
 */
public class IteratorTest2 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����", 25);// ��һ�ַ�ʽ��ֵ(�Ƽ�)
		Student s2 = new Student("С��", 16);
		Student s3 = new Student("����Ӣ", 20);
		Student s4 = new Student();
		s4.setName("����");// �ڶ��ַ�ʽ��ֵ
		s4.setAge(26);

		// ��ѧ��������ӵ����϶�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("������", 18)); // �����ַ�ʽ��ֵ����������

		// ��������
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
