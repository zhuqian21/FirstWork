package TestWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���������ҳ�Ψһ����һ�ε�Ԫ��
 * 
 * @author ��ٻ
 * 
 */
public class OnlyElement {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = cin.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		getSinglition(arr);
	}

	public static void getSinglition(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					flag = false;
					count++;
				}
			}
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}
}