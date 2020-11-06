package cn.itcast_01;

import java.io.CharConversionException;

/*
 * Character类在对象中包装一个基本类型char的值
 * 此外：该类提供了几种方法，以确定字符的类别（大写字母，数字，等等），并将字符从大写转换成小写，反之亦然
 * 
 * 构造方法：
 * 		Character(char value)
 */
public class CharacterDemo {
	public static void main(String[] args) {
		//创建对象
		//Character ch = new Character((char)97);
		Character ch = new Character('a');
		System.out.println("ch:"+ch);
	}
}
