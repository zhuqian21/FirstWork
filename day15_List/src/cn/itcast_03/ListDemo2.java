package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// Object get(int index):��ȡָ��λ�õ�Ԫ��
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
		// System.out.println(list.get(3));//IndexOutOfBoundsException

		// ѭ���Ľ�
		// for (int x = 0; x < 3; x++) {
		// System.out.println(list.get(x));
		// }

		// ���հ汾��size()������get()�����Ľ��
		for (int x = 0; x < list.size(); x++) {
			// System.out.println(list.get(x));

			String s = (String) list.get(x);
			System.out.println(s);
		}

	}
}
