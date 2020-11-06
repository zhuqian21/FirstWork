package cn.itcast_02;

/*
 * 数组排序之选择排序
 * 		从0索引开始，依次和后面元素比较，小的往前放置，第一次比较完毕，最小值出现在最小索引处
 */

public class ArrayDemo {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);

		/*
		 * // 第一次排序 int x = 0;// 第一个元素的索引 for (int y = 1; y < arr.length; y++) {
		 * if (arr[y] < arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] =
		 * temp; } } System.out.println("第一次比较"); printArray(arr);
		 * 
		 * // 第二次排序 x = 1;// 第二个元素的索引 for (int y = x+1; y < arr.length; y++) {
		 * if (arr[y] < arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] =
		 * temp; } } System.out.println("第二次比较"); printArray(arr);
		 */

		// 循环改进
		/*
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[y] < arr[x]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
		System.out.println("排序后");
		printArray(arr);
		*/
		
		//用方法改进
		selectSort(arr);
		System.out.println("排序后");
		printArray(arr);
	}
	
	public static void selectSort(int[] arr){
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[y] < arr[x]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	

	// 遍历数组
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
