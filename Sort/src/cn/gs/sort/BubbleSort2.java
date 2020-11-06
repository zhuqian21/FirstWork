package cn.gs.sort;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 1, 4, 2, 5, 7, 3 };
		int temp;

		System.out.println("ÅÅĞòÇ°£º");
		System.out.println(Arrays.toString(arr));
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("µÚ" + (i + 1) + "ÂÖÅÅĞòºó£º");
			System.out.println(Arrays.toString(arr));

			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
	}

}
