package com.zhuqian_02;

import com.zhuqian_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("�����ߵĹ�");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("��Թ�ͷ�Ĺ�");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("��ſ��˯");
	}

}
