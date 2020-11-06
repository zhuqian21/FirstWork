package cn.itcast_04;
/*
 * 注意：下面的做法是有问题的
 * 因为数组本身是无序的，这种情况下不能使用二分查找
 * 所以排序会改变数组原始元素的索引
 * 因此只能用基本查找
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);
		// 先排序
		bubbleSort(arr);
		System.out.println("排序后：");
		printArray(arr);
		// 后查找
		
		int index = getIndex(arr, 57);
		System.out.println("查找该元素在数组中的索引值:"+index);
	}

	// 冒泡排序
	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {// 比较的趟数
			for (int y = 0; y < arr.length - 1 - x; y++) {// 每趟要比较元素数量
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

	// 二分查找
	public static int getIndex(int[] arr, int value) {
		// 计算最大索引值和最小索引值
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

	// 打印数组
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
