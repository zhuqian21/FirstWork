package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		// ���Բ���All�ķ���

		// �������϶���
		// Collection c = new Collection();//���󣬽ӿڲ���ʵ����
		Collection c = new ArrayList();

		// boolean add(Object obj):���һ��Ԫ��
		// System.out.println("add:" + c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");

		// void clear():�Ƴ�����Ԫ��
		// c.clear();

		// boolean remove(Object o):�Ƴ�һ��Ԫ��
		// System.out.println("remove:" + c.remove("hello"));
		// System.out.println("remove:" + c.remove("hell"));

		// boolean contains(Object o):�жϼ����Ƿ����ָ����Ԫ��
		// System.out.println("contains:" + c.contains("hello"));
		// System.out.println("contains:" + c.contains("hell"));

		// boolean isEmpty():�жϼ����Ƿ�Ϊ��
		System.out.println("isEmpty:" + c.isEmpty());

		// int size():Ԫ�صĸ���
		System.out.println("size:" + c.size());
		System.out.println("c:" + c);

	}
}
