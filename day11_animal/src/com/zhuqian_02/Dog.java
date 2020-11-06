package com.zhuqian_02;

import com.zhuqian_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("会跳高的狗");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("会吃骨头的狗");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗趴着睡");
	}

}
