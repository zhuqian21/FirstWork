package cn.itcast_07;

/*
 * ���󣺰������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};
 * ��������
 *      "[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 * 
 * �Ѵ����ù���ʵ��
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		// ����
		int[] arr = { 1, 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] arr2 = { 1,2,3,4,6,7,8};
		// дһ�����ܣ�ʵ�ֽ��
		String result = arrayToString(arr);
		System.out.println("���ս���ǣ�"+result);
		System.out.println("-------------------");
		String result2 = arrayToString(arr2);
		System.out.println("���ս���ǣ�"+result2);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�String �����б�int[] arr
	 */
	public static String arrayToString(int[] arr) {
		// ����һ���������ַ�������
		String s = "";

		// �Ȱ��ַ���ƴ��һ��"["
		s += "[";

		// ��������õ�ÿһ��Ԫ��
		for (int x = 0; x < arr.length; x++) {
			// �жϸ�Ԫ���Ƿ�Ϊ���һ��
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
