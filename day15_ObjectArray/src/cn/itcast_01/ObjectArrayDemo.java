package cn.itcast_01;

/*
 * ����5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ
 * 		ѧ����Student
 * 		��Ա����:name,age
 * 		���췽�����޲Σ�����
 * 		��Ա������getXxx()/setXxx()
 * 		�洢ѧ�������飿�Լ�����Ӧ����ʲô���ӵģ�
 * ������
 * 		A:����ѧ����
 * 		B:����ѧ������(��������)
 * 		C:����5��ѧ�����󣬲���ֵ
 * 		D:��C�����Ԫ�طŵ�������
 * 		E:����ѧ������
 * 		
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		// ����ѧ������(��������)
		Student[] students = new Student[5];

		// ����5��ѧ�����󣬲���ֵ
		Student s1 = new Student("��ٻٻ", 27);
		Student s2 = new Student("������", 25);
		Student s3 = new Student("������", 22);
		Student s4 = new Student("�����", 21);
		Student s5 = new Student("Ľǳ", 25);

		// ��C�������Ԫ�أ��ŵ�������
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		// //ѭ���Ľ�
		// for(int x = 0;x<students.length;x++){
		// students[x] = s(x+1);
		// }

		// ����
		for (int x = 0; x < students.length; x++) {
			System.out.println(students[x]);

			// Student s = students[x];
			// System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
