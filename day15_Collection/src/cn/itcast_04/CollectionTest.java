package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ����
 * 
 * ������
 * 		A:�������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class CollectionTest {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// �����ַ�������
		// ���ַ���������ӵ�������
		c.add("Фս");
		c.add("��");
		c.add("ǳǳ");
		c.add("��");
		c.add("���Ƕ�");

		// ��������
		// 1.ͨ�����϶����ȡ����������
		Iterator it = c.iterator();
		// 2.ͨ�������������hasNext()�����ж���û��
		while (it.hasNext()) {
			// 3.ͨ�������������next()������ȡԪ��
			String s = (String) it.next();
			System.out.println(s + "---" + s.length());
		}
	}
}
