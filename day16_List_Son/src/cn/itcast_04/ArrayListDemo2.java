package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ArrayListȥ���������ַ������ظ�ֵ
 * Ҫ�󣺲��ܴ����µļ��ϣ�������ǰ�ļ�������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����ַ�������
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");

		// ��ѡ������˼�����룬���ǾͿ���ͨ������˼���������
		// ��0���������κͺ���ıȽϣ���ͬ�ͰѺ���ĸɵ�
		// ͬ����1�����ġ���
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;// ɾ��֮����һ��Ԫ�ز�λ������û���ж�
				}
			}
		}

		// ��������
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}
}
