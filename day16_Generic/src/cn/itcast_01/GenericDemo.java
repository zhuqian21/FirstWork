package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�ַ���������
 * 
 * ����ԭ�򣺴洢ʱ���洢���������͵�����String��Integer
 * 		     ���ڱ�����ʱ�����ǰ����ǵ���String���ʹ���ģ�����ת�������Ծͱ�����
 * 		     ���ǣ����ڱ����ڼ�ȴû�и�������
 * �����Ҿ��������Ʋ���
 * �����������ƣ�
 * 		String[] strArray = new String[3];
 * 		strArray[0] = "hello";
 * 		strArray[1] = "world";
 * 		strArray[2] = 10;
 * 
 * ����Ҳģ��������������������ڴ�����ʱ����ȷԵ���ǵ��������ͣ������Ͳ������������ˡ�Ҳ����Ϊ����������(�����͵�������һ������)��
 * 
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ�����������
 * ��ʽ��
 * 		<��������>���˴�����������ֻ�����������͡�
 * �ô���
 * 		A:������ʱ�ڵ�������ǰ���˱���ʱ��
 * 		B:������ǿ������ת��
 * 		C:�Ż��ĳ�����ƣ�����˻�ɫ������
 */
public class GenericDemo {
	public static void main(String[] args) {
		// ��������
		ArrayList<String> array = new ArrayList<String>();

		// ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(new Integer(100));
		// array.add(10); // JDK5�Ժ��Զ�װ��,�ȼ��ڣ�array.add(Integer.ValueOf(10));

		// ����
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// ClassCastException
			// String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}

		// String[] strArray = new String[3];
		// strArray[0] = "hello";
		// strArray[1] = "world";
		// // strArray[2] = 10;//ֱ�ӱ���
	}
}
