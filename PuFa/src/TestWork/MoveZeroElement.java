package TestWork;

/**
 * ��һ��8Ԫ����������1 3 0 3 6 0 0 9������0�ź��棬
 * ��������˳�򲻱䣬���Ϊ1 3 3 6 9 0 0 0
 */
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroElement {
	public static void main(String[] args) {
		System.out.println("����������Ԫ�ظ�����");
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();// ����Ԫ�ظ���
		System.out.println("�������������Ԫ�أ�");
		int[] nums = new int[n];// ��������
		for (int i = 0; i < n; i++) {
			nums[i] = cin.nextInt();
		}
		getResult(nums);
	}

	public static void getResult(int[] nums) {
		int slow = 0;//
		int fast = 0;
		while (fast < nums.length) {
			if (nums[fast] != 0) {
				nums[slow] = nums[fast];
				slow++;
				fast++;
			} else {
				fast++;
			}
		}

		// ����©����0
		for (int i = slow; i < nums.length; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
