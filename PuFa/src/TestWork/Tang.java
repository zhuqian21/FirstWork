package TestWork;

/**
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻 �����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
 * 
 * @author ��ٻ
 * 
 */
public class Tang {
	public static void main(String[] args) {
		double sum = 0;
		double height = 100;
		int count = 0;
		heightAndSum(sum, height, count);
	}

	public static void heightAndSum(double sum, double height, int count) {
		for (height = 100; height >= 0; height /= 2) {
			count++;
			sum += height * 2;
		}
		System.out.println("��10�ε������ܳ��ȣ�" + sum + 100);
		System.out.println("��10�η����߶ȣ�" + height / 2);
		System.out.println("����������" + count);
	}
}
