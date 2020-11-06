package TestWork;

/**
 * 给一个8元素数组例如1 3 0 3 6 0 0 9将所有0放后面，
 * 其他数字顺序不变，结果为1 3 3 6 9 0 0 0
 */
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroElement {
	public static void main(String[] args) {
		System.out.println("请输入数组元素个数：");
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();// 数组元素个数
		System.out.println("请输入数组各个元素：");
		int[] nums = new int[n];// 创建数组
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

		// 补上漏掉的0
		for (int i = slow; i < nums.length; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
