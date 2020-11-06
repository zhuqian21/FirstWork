package TestWork;

import java.util.Scanner;
import java.util.Stack;

public class PerfectSquare {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int in = sc.nextInt();
			// ̰���㷨
			for (int i = (int) Math.sqrt(in); i >= 1; i--) {
				in -= i * i;
				if (in >= 0) {
					stack.push(i * i);
				}
				// ���������ֵС��0����ָ���ԭ������ֵ�Ĵ�С
				if (in < 0) {
					in += i * i;
				}
			}
			// ��22=16+4+1+1��in=1�������NULL
			if (in == 0) {
				while (!stack.isEmpty()) {
					System.out.println(stack.pop() + " ");
				}
			} else {
				System.out.println("NULL");
			}
		}
	}
}
