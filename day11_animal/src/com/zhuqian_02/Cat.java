package com.zhuqian_02;

import com.zhuqian_01.Jump;

/**
 * ���Ǿ����è��
 * @author ��ٻ
 * @versio V1.0
 */
public class Cat extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("�����ߵ���");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("è������˯��");
	}

}
