package cn.itcast_01;

/*
 * ��������֮ð������
 * 		����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);
		/*
		// ��һ�αȽ�
		for (int x = 0; x < arr.length - 1; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("��һ�αȽϺ�");
		printArray(arr);

		// �ڶ��αȽ�
		for (int x = 0; x < arr.length - 1 - 1; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("�����αȽϺ�");
		printArray(arr);

		// �����αȽ�
		for (int x = 0; x < arr.length - 1 - 2; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("���ĴαȽϺ�");
		printArray(arr);
		// ���ĴαȽ�
		for (int x = 0; x < arr.length - 1 - 3; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("���ĴαȽϺ�");
		printArray(arr);
		*/
		/*
		//ѭ���Ľ�
		for(int y = 0;y<arr.length-1;y++){
			for (int x = 0; x < arr.length - 1 - y; x++) {
				if (arr[x] > arr[x + 1]) {
					int temp = arr[x];
					arr[x] = arr[x + 1];
					arr[x + 1] = temp;
				}
			}
		}
		System.out.println("�����");
		printArray(arr);
		*/
		
		//�����ҿ����ж������Ҫ�������Ҫд�ɷ���	
		bubbleSort(arr);
		System.out.println("�����");
		printArray(arr);
	}
	
	//ð�����򷽷�
	//�޷���ֵ  
	//����
	public static void bubbleSort(int[] arr){
		for(int y = 0;y<arr.length-1;y++){
			for (int x = 0; x < arr.length - 1 - y; x++) {
				if (arr[x] > arr[x + 1]) {
					int temp = arr[x];
					arr[x] = arr[x + 1];
					arr[x + 1] = temp;
				}
			}
		}
	}

	// ��������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ",");
			}
		}
		System.out.println("]");
	}
}
