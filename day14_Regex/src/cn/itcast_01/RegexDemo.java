package cn.itcast_01;

import java.util.Scanner;

/*
 * У��QQ����
 * 		1��Ҫ�������5-15λ����
 * 		2:0���ܿ�ͷ
 * 
 * ������
 * 		A:����¼��һ��QQ����
 * 		B:дһ�� ����ʵ��У��
 * 		C:���ù��ܣ�������
 */
public class RegexDemo {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������QQ���룺");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ:"+checkQQ(qq));
	}
	
	/*
	 * дһ������ʵ��У��
	 * ������ȷ
	 * ��ȷ����ֵ���ͣ�boolean  �Ƿ���������
	 * ��ȷ�����б�String qq
	 */
	public static boolean checkQQ(String qq){
		boolean flag = true;
		
		//У�鳤��
		if(qq.length()>=5 && qq.length()<=15){
			//0���ܿ�ͷ
			if(!qq.startsWith("0")){
				//����������
				char[] chs = qq.toCharArray();
				for(int x = 0;x<chs.length;x++){
					char ch = chs[x];
					if(!Character.isDigit(ch)){
						flag = false;
						break;
					}
				}
			}else{
				flag = false;
			}
		}else{
			flag = false;
		}
		return flag;
	}
	
}
