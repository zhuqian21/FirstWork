package cn.itcast_05;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����࣬��������Ͳ��ҡ�
 * 1:public static String toString(int[] a):������ת���ַ���
 * 2:public static void sort(int[] a):�������������
 * 3:public static int binarySearch(int[] a,int key):���ֲ���
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		
		System.out.println("����ǰbinarySearch:"+Arrays.binarySearch(arr, 80));
		//1:public static String toString(int[] a):������ת���ַ���
		System.out.println("����ǰ��"+Arrays.toString(arr));//ͨ������ֱ�ӵ�����
		
		//2:public static void sort(int[] a):�������������
		Arrays.sort(arr);//�ײ��õĿ�������
		System.out.println("�����:"+Arrays.toString(arr));
		
		//3:public static int binarySearch(int[] a,int key):���ֲ���
		System.out.println("����Ԫ�����ڵ�������"+Arrays.binarySearch(arr, 388));
	}
}
