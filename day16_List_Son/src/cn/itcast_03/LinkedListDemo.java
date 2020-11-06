package cn.itcast_03;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedList link = new LinkedList();

		// 添加元素
		link.add("hello");
		link.add("world");
		link.add("java");

		// public void addFirst(Object e)
		// link.addFirst("javaee");

		// public void addLast(Object e)
		link.addLast("android");

		// public Object getFirst(Object e)
		// System.out.println(link.getFirst());

		// public Object getLast(Object e)
		// System.out.println(link.getLast());

		// public Object removeFirst(Object e)
		System.out.println(link.removeFirst());
		// public Object removeFirst(Object e)
		System.out.println(link.removeLast());
		System.out.println(link);
	}
}
