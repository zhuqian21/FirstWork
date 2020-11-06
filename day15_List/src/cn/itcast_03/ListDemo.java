package cn.itcast_03;

//15-20
import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����й��ܣ�
 * 		A:��ӹ���
 * 			void add(int index,Object element):��ָ��λ�����Ԫ��
 * 		B:��ȡ����
 * 			Object get(int index):��ȡָ��λ�õ�Ԫ��
 * 		C:�б������
 * 			ListIterator listIterator():List�������еĵ�����
 * 		D:ɾ������
 * 			Object remove(int index):��������ɾ��Ԫ��,���ر�ɾ����Ԫ��
 * 		E:�޸Ĺ���
 * 			Object set(int index,Object element)���������޸�Ԫ�أ����ر��޸ĵ�Ԫ��
 */
public class ListDemo {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// void add(int index,Object element):��ָ��λ�����Ԫ��
		// list.add(11, "zhu");//IndexOutOfBoundsException
		// list.add(1, "zhu");
		// list.add(3, "javaee");
		// list.add(4, "javaee");//IndexOutOfBoundsException

		// Object get(int index):��ȡָ��λ�õ�Ԫ��
		// System.out.println("get:" + list.get(1));
		// System.out.println("get:" + list.get(11));//IndexOutOfBoundsException

		// Object remove(int index):��������ɾ��Ԫ��,���ر�ɾ����Ԫ��
		// System.out.println("remove:" + list.remove(1));
		// System.out.println("remove:" +
		// list.remove(11));//IndexOutOfBoundsException

		// Object set(int index,Object element)���������޸�Ԫ�أ����ر��޸ĵ�Ԫ��
		System.out.println("set:" + list.set(1, "javaee"));
		System.out.println("list" + list);
	}
}
