package cn.itcast_01;

/**
 * ��Object �����νṹ�ĸ��࣬ÿ���඼ʹ��Object��Ϊ����
 * ÿ���඼ֱ�ӻ��ӵļ̳���Object��
 * 
 * Object��ķ�����
 *        public int hashCode():���ظö���Ĺ�ϣ��ֵ��
 *           **:��ϣֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�й�
 * @author ��ٻ
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.hashCode());
		Student student2 = new Student();
		System.out.println(student2.hashCode());
		
		Student student3 = student;
		System.out.println(student3.hashCode());
		
		System.out.println("__________");
		
		
		Student s = new Student();
		Class c= s.getClass();
		String str = c.getName();
		System.out.println(str);
		
		//��ʽ���
		String str2 = s.getClass().getName();
		System.out.println(str2);
		
		
		
		
		
	}
}
