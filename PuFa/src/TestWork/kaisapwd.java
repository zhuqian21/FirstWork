package TestWork;

import java.util.Scanner;

public class kaisapwd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[A:����][J:����],��ѡ��һ��");
		Scanner c = new Scanner(System.in);// ����Scanner����
		String s1 = c.nextLine();// ��ȡ���е��ַ���
		if (s1.equalsIgnoreCase("A")) {// �жϱ���s1��A�Ƿ���ȣ����Դ�С
			System.out.println("���������ģ�");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println("��������Կ:");
			Scanner sc1 = new Scanner(System.in);
			int key = sc1.nextInt();// ����һ������ת����int����
			Encryption(s, key);// ����Encryption����
		} else if (s1.equalsIgnoreCase("J")) {
			System.out.println("����������:");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println("��������Կ��");
			Scanner sc1 = new Scanner(System.in);
			int key = sc1.nextInt();
			Decrypt(s, key);// ����Decrypt����
		}
	}

	public static void Decrypt(String str, int n) {
		// TODO Auto-generated method stub
		// ����
		int k = Integer.parseInt("-" + n);
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);// ���ڷ���ָ�����������ַ�
			if (c >= 'a' && c <= 'z') {// ����ַ����е�ĳ���ַ���Сд��ĸ
				c += k % 26;// �ƶ�key%26λ
				if (c < 'a')
					c += 26;// ���󳬽�
				if (c > 'z')
					c -= 26;// ���ҳ���
			} else if (c >= 'A' && c <= 'Z') {// ����ַ����е�ĳ���ַ��Ǵ�д��ĸ
				c += k % 26;// �ƶ�key%26λ
				if (c < 'A')
					c += 26;// ���󳬽�
				if (c > 'Z')
					c -= 26;// ���ҳ���
			}
			string += c;// �����ܺ���ַ������ַ���
		}
		System.out.println(str + "���ܺ�Ϊ��" + string);
	}

	public static void Encryption(String str, int k) {
		// TODO Auto-generated method stub
		// ����
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {// ����ַ����е�ĳ���ַ���Сд��ĸ
				c += k % 26;// �ƶ�key%26λ
				if (c < 'a')
					c += 26;// ���󳬽�
				if (c > 'z')
					c -= 26;// ���ҳ���
			} else if (c >= 'A' && c <= 'Z') {// ����ַ����е�ĳ���ַ��Ǵ�д��ĸ
				c += k % 26;// �ƶ�key%26λ
				if (c < 'A')
					c += 26;// ���󳬽�
				if (c > 'Z')
					c -= 26;// ���ҳ���
			}
			string += c;// �����ܺ���ַ������ַ���
		}
		System.out.println(str + "���ܺ�Ϊ��" + string);
	}
}