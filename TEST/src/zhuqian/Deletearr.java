package zhuqian;

import java.util.Arrays;
import java.util.Scanner;

public class Deletearr {
	public static void main(String[] args) {
		int m = 5;
		int[] arr = new int[m];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入" + m + "个整数：");
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("请输入要删除第几个元素：");

		int n = sc.nextInt();
		sc.close();

		// 把最后一个元素替代指定的元素
		for (int i = n; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}

		// 数组缩容

		arr = Arrays.copyOf(arr, arr.length - 1);

		System.out.println(Arrays.toString(arr));

		// int x = 2;
		// System.out.println("请输入要删除哪" + x + "几个元素：");
		// for (int j = 0; j < x; j++) {
		// int n = sc.nextInt();
		// }
		// sc.close();
		// // 把最后一个元素替代指定的元素
		// arr[x - 1] = arr[arr.length - 1];
		// //
		// // 数组缩容
		// arr = Arrays.copyOf(arr, arr.length - 1);
		// System.out.println(Arrays.toString(arr));
	}
}
