package cn.itcast_01;

import java.util.Random;

/*
 * Random:�������������
 * 
 * ���췽����
 * 		public Random():û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 * 		public Random(long seed)������ָ��������
 * 		�������Ӻ�ÿ�εõ������������ͬ��
 * 
 * ��Ա������
 * 		public int nextInt():���ص���int��Χ�ڵ������
 * 		public int nextInt():���ص���[0,n)��Χ�ڵ������
 */
public class RandomDemo {
	public static void main(String[] args) {
		//��������
		//Random r = new Random();
		Random r = new Random(1111);
		for(int x = 0;x<20;x++){
			//int num = r.nextInt();
			int num = r.nextInt(100)+1;
			System.out.println(num);
		}
		//public int nejxtInt():���ص���int��Χ�ڵ������
		
	}
}
