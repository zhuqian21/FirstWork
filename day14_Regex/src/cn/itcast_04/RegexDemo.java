package cn.itcast_04;
/*
 * �滻����
 * 		String�����public String replaceAll(String regex,String replacement)
 *		ʹ�ø�����replacement�滻���ַ�������ƥ�������֣����ʽ�����ַ���
 *
 */
public class RegexDemo {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "helloqq12345world622112345678java";
		
		//��Ҫȥ�����е����֣���*���滻��
		//String regex = "\\d+";
		String regex = "\\d";
		//String ss = "*";
		String ss = "";
		
		String result = s.replaceAll(regex,ss);
		System.out.println(result);
	}
}
