package cn.itcast_02;

import java.math.BigDecimal;

/*
 * ���췽����
 * 		public BigDecimal(String val)
 * 
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtracend)
 * public BigDecimal multiply(BigDecimal mutiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):��,С��λ��,�����ȡ
 * divisor -- BigDecimalҪ���Ե�ֵ
 * scale -- Ҫ���ص�BigDecimal�̵ı��
 * roundMode -- ҪӦ�õ�����ģʽ
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		// System.out.println(0.09 + 0.01);//0.09999999999999999
		// System.out.println(1.0 - 0.32);//0.6799999999999999
		// System.out.println(1.015 * 100);//101.49999999999999
		// System.out.println(1.301 / 100);//0.013009999999999999
		//
		// System.out.println(1.0-0.12);
		
		//public BigDecimal add(BigDecimal augend)
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:"+bd1.add(bd2));
		
		//public BigDecimal subtract(BigDecimal subtracend)
		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:"+bd3.subtract(bd4));
		
		//public BigDecimal multiply(BigDecimal mutiplicand)
		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:"+bd5.multiply(bd6));
		
		//public BigDecimal divide(BigDecimal divisor)
		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:"+bd7.divide(bd8));
		
		//public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode)
		System.out.println("divide:"+bd7.divide(bd8,3,BigDecimal.ROUND_HALF_UP));
	}
}
