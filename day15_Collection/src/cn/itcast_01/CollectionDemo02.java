package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
	public static void main(String[] args) {
		// ��������1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// ��������2
		Collection c2 = new ArrayList();
		c2.add("abc1");
		c2.add("abc2");
		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// boolean addAll(Collection c):���һ�����ϵ�Ԫ��
		// System.out.println("addAll:" + c1.addAll(c2));
		// c1.addAll(c2);
		// boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
		// ֻҪ��һ���Ƴ��˾ͽ��Ƴ�,�Ƴ����������Ϲ��е�Ԫ��
		// System.out.println("removeAll:" + c2.removeAll(c1));

		// boolean containsAll(Collection c):�жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
		// ֻ�а������е�Ԫ�زŽа���
		// System.out.println("containsAll:" + c1.containsAll(c2));

		// boolean retainAll(Collection c):�������϶��е�Ԫ�أ�˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼�أ�
		// ��������������A,B��
		// A��B�����������ս��������A�У�B����
		// ����ֵ��ʾ���Ƿ������ı�
		System.out.println("retainAll:" + c1.retainAll(c2));

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	}
}
