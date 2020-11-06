package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;

/*
 * ���⣺
 * 		����һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ��
 * ConcurrentModificationException:��������⵽����Ĳ����޸ģ��������������޸ģ��׳����쳣
 * ������ԭ��
 * 		�������������ڼ��϶����ڵģ����жϳɹ��󣬼����������Ԫ�أ���������ȴ��֪���������в����޸��쳣
 * 		��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�ص�
 * ���������
 * 		A:����������Ԫ�أ��������޸�Ԫ��
 * 			Ԫ��������ڸղŵ�����Ԫ�غ����
 * 		B:���ϱ���Ԫ�أ������޸�Ԫ�أ���ͨforѭ����
 * 			Ԫ����������б�������
 */
public class ListIteratorDemo2 {
	public static void main(String[] args) {
		// ����List���϶���
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		// ����������
		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// if ("world".equals(s)) {
		// list.add("javaee");
		// }
		// }

		// ����A������������Ԫ�أ��������޸�Ԫ��
		// ��Iterator������ȴû�����Ԫ�ع��ܣ���������ʹ�����ӽӿ�ListIterator
		// ListIterator lit = list.listIterator();
		// while (lit.hasNext()) {
		// String s = (String) lit.next();
		// if ("world".equals(s)) {
		// lit.add("javaee");
		// }
		// }

		// ��ʽB:���ϱ���Ԫ�أ������޸�Ԫ�أ���ͨforѭ��)
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		System.out.println("list:" + list);
	}

}
