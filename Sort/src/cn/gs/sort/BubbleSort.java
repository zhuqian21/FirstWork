package cn.gs.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 4, 3, 2, 1 };
		System.out.println("����ǰ��");
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("��" + (i + 1) + "�������");
			System.out.println(Arrays.toString(arr));
		}
	}
}
