package TestWork;

import java.util.Scanner;

public class sanjiao {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入三条边:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a+b)>c&&(a+c)>b&&(b+c)>a){
			if(a*a==(b*b+c*c)){
				System.out.println("是直角三角形");
			}else if(b*b==(a*a+c*c)){
				System.out.println("是直角三角形");
			}else if(c*c==(a*a+b*b)){
				System.out.println("是直角三角形");
			}else{
				System.out.println("是三角形，不是直角");
			}
		}else{
			System.out.println("不是一个三角形");
		}
	}
}
