package cn.itcast_05;
/*
 * JDK5�������ԣ�
 * �Զ�װ�䣺�ѻ�������ת���ɰ�װ������
 * �Զ����䣺�Ѱ�װ������ת���ɻ�������
 * 
 * ע�⣺
 * 		��ʹ��ʱ��Integer x = null; ��������NullPointException
 * 		�������ж��Ƿ�Ϊnull��Ȼ����ʹ��
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// ������һ��int���͵İ�װ�����ͱ���i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:"+ii);
		
		//�����룺
		//Integer ii = Integer.valueOf(100);//�Զ�װ��
		//ii = Integer>valueOf(ii.intValue()+200);//�Զ����䣬���Զ�װ��
		System.out.println((new StringBuilder("ii:")).append(ii).toString());
		
		Integer iii = null;
		//NullPointerException
		if(iii!=null){
		iii+=1000;
		System.out.println(iii);
		}
	}
}
