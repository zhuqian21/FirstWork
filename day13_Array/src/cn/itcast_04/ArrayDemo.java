package cn.itcast_04;

import java.util.Arrays;

/*
 * ���ң�
 * 		�������ң�����Ԫ������(��ͷ�ҵ�β)
 * 		���ֲ���(�۰����)������Ԫ������
 * 
 * ������
 * 		A�����������������С����
 * 		B��������м�����
 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
 * 			��ȣ��ͷ��ص�ǰ���м�����
 * 			����ȣ�
 * 				��ǰ�м�ֵ��Ҫ���ҵ�ֵ�������
 * 				��ǰ�м�ֵ��Ҫ���ҵ�ֵС���ұ���
 *		D:���¼����м�����
 *			�������
 *			   max = mid-1;
 *			С���ұ���
 *			   min = mid+1;
 * 		E:�ص�B
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println(Arrays.toString(arr));
		// д����ʵ��
		int index = getIndex(arr,33);
		//System.out.println("index:"+index);
		
		//�������Ԫ�ز�����
		index = getIndex(arr,333);
		//System.out.println("index:"+index);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�int �����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr, int value) {
		// ���������������С����
		int max = arr.length - 1;
		int min = 0;

		// �����м�����
		int mid = (min + max) / 2;

		// ���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}
			
			//�����ж�
			if(min>max){
				return -1;
			}
			mid = (min + max) / 2;
		}
		return mid;
	}
}
