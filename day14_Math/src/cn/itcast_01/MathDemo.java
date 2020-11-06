package cn.itcast_01;
/*
 * Math:������ѧ�������
 * ��Ա������
 * 		public static final double PI
 * 		public static final double E
 * ��Ա������
 * 		public static int abs(int a):����ֵ
 * 		public static double ceil(double a)������ȡ��(ceil:�컨��)
 * 		public static double floor(double a)������ȡ��(floor:�ذ�)
 * 		public static int max(int a,int b)�����ֵ; (min��ѧ)
 * 		public static double pow(double a,double b):a��b����
 * 		public static double random():�����[0.0,1.0)
 * 		public static int round(float a)���������루����Ϊdouble����ѧ��
 * 		public static double sqrt(double a)����ƽ����
 */
public class MathDemo {
	public static void main(String[] args) {
		//public static final double PI
		System.out.println("PI:"+Math.PI);
		//public static final double E
		System.out.println("E:"+Math.E);
		System.out.println("----------");
		
		//public static int abs(int a):����ֵ
		System.out.println("abs:"+Math.abs(10));
		System.out.println("abs:"+Math.abs(-10));
		System.out.println("----------");
		
		//public static double ceil(double a)������ȡ��(ceil:�컨��)
		System.out.println("ceil:"+Math.ceil(12.89));
		System.out.println("ceil:"+Math.ceil(12.01));
		
		//public static double floor(double a)������ȡ��(floor:�ذ�)
		System.out.println("floor:"+Math.floor(12.89));
		System.out.println("floor:"+Math.floor(12.01));

		//public static int max(int a,int b)�����ֵ; (min��ѧ)
		System.out.println("max:"+Math.max(12, 12.1));
		System.out.println("----------");
		
		//��������Ҫ��ȡ���������е����ֵ
		//������Ƕ�׵���
		System.out.println("max:"+Math.max(Math.max(12, 12.1),13));
		System.out.println("max:"+Math.max(Math.max(Math.max(12, 13), 14), 15));
		System.out.println("----------");
		
		//public static double pow(double a,double b):a��b����
		System.out.println("pow:"+Math.pow(2,3));
		System.out.println("-----------");
		
		//public static double random():�����[0.0,1.0)
		System.out.println("random:"+Math.random());
		//��ȡ1-100֮��������
		System.out.println("random:"+((int)(Math.random()*100)+1));
		System.out.println("------------");
		
		//public static int round(float a)���������루����Ϊdouble����ѧ��
		System.out.println("round:"+Math.round(12.49f));
		System.out.println("round:"+Math.round(12.50f));
		System.out.println("------------");
		
		//public static double sqrt(double a)����ƽ����
		System.out.println("sqrt:"+Math.sqrt(8));
		
		
		
	}
}
