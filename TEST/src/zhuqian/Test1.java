package zhuqian;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] n = new int[] { 1, 2, 3, 4, 5 };
		int[] a = delete(n, 4);
		int[] a1 = delete(a, 6);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));
	}

	// ɾ��ָ��λ��Ԫ��
	public static int[] delete(int[] n, int index) {
		int j = 0;
		if (index < 0 || index >= n.length) {
			System.out.println("û�ж�Ӧ��Ԫ�ؿ�ɾ��");
			return n;
		}
		int[] b = new int[n.length - 1];
		for (int i = 0; i < n.length; i++) {
			if (i == index)
				continue;
			b[j++] = n[i];
		}
		return b;
	}

}
