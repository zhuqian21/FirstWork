package TestWork;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半； 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * 
 * @author 朱倩
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
		System.out.println("第10次弹跳后总长度：" + sum + 100);
		System.out.println("第10次反弹高度：" + height / 2);
		System.out.println("反弹次数：" + count);
	}
}
