package zhuqian;

import java.util.Arrays;
import java.util.Scanner;

public class Deletearr {
	public static void main(String[] args) {
		int m = 5;
		int[] arr = new int[m];
		Scanner sc = new Scanner(System.in);
		System.out.println("������" + m + "��������");
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("������Ҫɾ���ڼ���Ԫ�أ�");

		int n = sc.nextInt();
		sc.close();

		// �����һ��Ԫ�����ָ����Ԫ��
		for (int i = n; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}

		// ��������

		arr = Arrays.copyOf(arr, arr.length - 1);

		System.out.println(Arrays.toString(arr));

		// int x = 2;
		// System.out.println("������Ҫɾ����" + x + "����Ԫ�أ�");
		// for (int j = 0; j < x; j++) {
		// int n = sc.nextInt();
		// }
		// sc.close();
		// // �����һ��Ԫ�����ָ����Ԫ��
		// arr[x - 1] = arr[arr.length - 1];
		// //
		// // ��������
		// arr = Arrays.copyOf(arr, arr.length - 1);
		// System.out.println(Arrays.toString(arr));
	}
}
