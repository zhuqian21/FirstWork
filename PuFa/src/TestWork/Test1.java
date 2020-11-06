package TestWork;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int a,b,c;
		while(cin.hasNext()){
			a = cin.nextInt();
			b = cin.nextInt();
			c = cin.nextInt();
			
			if(a<=0||b<=0||c<=0){
				System.out.println("请输入正整数！");
			}else if(a+b>c&&a+c>b&&b+c>a){
				System.out.println("能组成三角形！");
			}else{
				System.out.println("不能组成三角形！");
			}
		}
	}

}
