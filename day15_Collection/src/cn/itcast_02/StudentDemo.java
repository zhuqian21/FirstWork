package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б���
 * 
 * ������
 * A������ѧ����
 * B���������϶���
 * C������ѧ������
 * D����ѧ����ӵ�����
 * E���Ѽ���ת������
 * F����������
 */
public class StudentDemo {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("Фս", 29);
		Student s2 = new Student("������", 25);
		Student s3 = new Student("����", 43);
		Student s4 = new Student("����", 30);
		Student s5 = new Student("����", 45);

		// ��ѧ����ӵ�����
		c.add(s1); // ����ת��
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// �Ѽ���ת������
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			// System.out.println(objs[x]);

			Student s = (Student) objs[x];// ����ת��
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
