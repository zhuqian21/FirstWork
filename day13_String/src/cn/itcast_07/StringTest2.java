package cn.itcast_07;

/*
 * 需求：把数组中的数据按照指定格式拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3};
 * 输出结果：
 *      "[1, 2, 3]"
 * 分析：
 * 		A:定义一个字符串对象，只不过内容为空
 * 		B:先把字符串拼接一个"["
 * 		C:遍历int数组，得到每一个元素
 * 		D:先判断该元素是否为最后一个
 * 			是：就直接拼接元素和"]"
 * 			不是：就拼接元素和逗号以及空格
 * 		E:输出拼接后的字符串
 * 
 * 把代码用功能实现
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		// 数组
		int[] arr = { 1, 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] arr2 = { 1,2,3,4,6,7,8};
		// 写一个功能，实现结果
		String result = arrayToString(arr);
		System.out.println("最终结果是："+result);
		System.out.println("-------------------");
		String result2 = arrayToString(arr2);
		System.out.println("最终结果是："+result2);
	}

	/*
	 * 两个明确： 返回值类型：String 参数列表：int[] arr
	 */
	public static String arrayToString(int[] arr) {
		// 定义一个空内容字符串对象
		String s = "";

		// 先把字符串拼接一个"["
		s += "[";

		// 遍历数组得到每一个元素
		for (int x = 0; x < arr.length; x++) {
			// 判断该元素是否为最后一个
			if (x == arr.length - 1) {
				s += arr[x];
				s += "]";
			} else {
				s += arr[x];
				s += ", ";
			}
		}
		return s;
	}
}
