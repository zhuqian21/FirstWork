package cn.itcast_04;
/*
 * ע�⣺������������������
 * ��Ϊ���鱾��������ģ���������²���ʹ�ö��ֲ���
 * ���������ı�����ԭʼԪ�ص�����
 * ���ֻ���û�������
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);
		// ������
		bubbleSort(arr);
		System.out.println("�����");
		printArray(arr);
		// �����
		
		int index = getIndex(arr, 57);
		System.out.println("���Ҹ�Ԫ���������е�����ֵ:"+index);
	}

	// ð������
	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {// �Ƚϵ�����
			for (int y = 0; y < arr.length - 1 - x; y++) {// ÿ��Ҫ�Ƚ�Ԫ������
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

	// ���ֲ���
	public static int getIndex(int[] arr, int value) {
		// �����������ֵ����С����ֵ
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}
			if (min > max) {
				return -1;
			}
			mid = (min + max) / 2;
		}
		return mid;
	}

	// ��ӡ����
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}

}
