package cn.itcast_03;

import java.util.Arrays;

/*
 * system�����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * 
 * ������
 * 		public static void gc():�������ջ���
 * 		public static void exit(int status)����ֹ��ǰ�������е�JAVA�����������Ϊ״̬�룻��0״̬���ʾ�쳣�ս�
 * 		public static long currentTimeMillis():�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * 		public static void arraycopy(Object src,int srcPos,object dest,int destPos,int length):
 * 		��ָ��Դ����(src)�и���һ�����飬���ƴ�ָ����λ��(srcPos)��ʼ����Ŀ������(dest)��ָ��λ��(destPos)����
 *		src:Դ����
 *		srcPos:Դ�����е���ʼλ��
 *		dest:Ŀ������
 *		destPos:Ŀ�������е���ʼλ��
 *		length:Ҫ���Ƶ�����Ԫ�ص�����
 */
public class SystemDemo {
	public static void main(String[] args) {
		//��������
		int[] arr = {11,22,33,44,55};
		int[] arr2 = {6,7,8,9,10};
		System.arraycopy(arr, 1, arr2, 2, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
