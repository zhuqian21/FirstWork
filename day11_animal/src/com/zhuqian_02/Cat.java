package com.zhuqian_02;

import com.zhuqian_01.Jump;

/**
 * 这是具体的猫类
 * @author 朱倩
 * @versio V1.0
 */
public class Cat extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("会跳高的喵");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("猫眯着眼睡觉");
	}

}
