package TestWork;

import java.util.Scanner;

public class sanjiao {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a+b)>c&&(a+c)>b&&(b+c)>a){
			if(a*a==(b*b+c*c)){
				System.out.println("��ֱ��������");
			}else if(b*b==(a*a+c*c)){
				System.out.println("��ֱ��������");
			}else if(c*c==(a*a+b*b)){
				System.out.println("��ֱ��������");
			}else{
				System.out.println("�������Σ�����ֱ��");
			}
		}else{
			System.out.println("����һ��������");
		}
	}
}
