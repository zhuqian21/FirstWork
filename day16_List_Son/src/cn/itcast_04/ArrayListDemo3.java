package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * 
 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ�������
 * Ϊʲô��
 * 		contains()�����ĵײ���������equals()������
 * 		�����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
 * 		Object()��equals()Ĭ�ϱȽϵ��ǵ�ֵַ�����ԣ����ǽ�ȥ�ˣ���Ϊnew�Ķ�������ֵַ����ͬ
 * 		
 * 		���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()���ɡ�
 *		 �Զ����ɼ���
 * 		
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("���Ѿ�", 16);
		Student s2 = new Student("����", 19);
		Student s3 = new Student("��ʩ", 16);
		Student s4 = new Student("�Է���", 16);
		Student s5 = new Student("���Ѿ�", 16);
		Student s6 = new Student("���Ѿ�", 26);
		Student s7 = new Student("�����", 16);
		Student s8 = new Student("���", 22);

		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		array.add(s8);

		// �����¼���
		ArrayList newArray = new ArrayList();

		// �����ɼ��ϣ���ȡÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			// �����Ԫ�ص��¼���ȥ�ң���û����ͬԪ��
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		// �����¼���
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
