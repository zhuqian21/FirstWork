package cn.itcast_03;

import java.util.Scanner;

/*
 * ģ���¼�������λ��ᣬ����ʾ���м���
 * 
 * ������
 *     A�������û��������룬�Ѵ��ڵ�
 *     B������¼���û���������
 *     C���Ƚ��û��������롣
 *         �������ͬ�����¼�ɹ�
 *         �����һ����ͬ�����¼ʧ��
 *     D�������λ��ᣬ��ѭ���Ľ��������forѭ����
 */
public class StringTest02 {
	public static void main(String[] args) {
		// �����û��������룬�Ѵ��ڵġ�
 		String username = "admin";
		String password = "admin";

		// �����λ��ᣬ��ѭ���Ľ��������forѭ����
		for (int x = 0; x < 3; x++) {
			// ����¼���û��������롣
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �Ƚ��û��������롣
			if (name.equals(username) && pwd.equals(password)) {
				// �������ͬ�����¼�ɹ�
				System.out.println("��¼�ɹ���");
				
				System.out.println("��¼�ɹ�����ʼ����Ϸ��");
				//��������Ϸ
				GuessNumberGame.start();
				break;
			} else {
				// �����һ����ͬ�����¼ʧ��
				//����ǵ�0�Σ�Ӧ�û�һ����ʾ
				if((2-x)==0){
				System.out.println("�˺ű�����������೤��ϵ��");
				}else{
					System.out.println("��¼ʧ��,�㻹��"+(2-x)+"�λ��ᣡ");
				}
			}
		}
	}
}
