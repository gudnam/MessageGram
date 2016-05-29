package com.gudrang.messagegram.creatures.human;

public class 굳랑 extends 남성 {

	String name = "GudRang";
	String job = "Programmer";
	String subJob = "MessageGrammer";
	String identity = "In Christ";
	int old = 28;
	boolean isMarried = false;
	
	public 굳랑() {
		나는();
	}
	
	void 나는() {
		System.out.println("안녕하세요! 제 이름은 " + name + "입니다 ^^");
		System.out.println("나이는 " + old + "!");
		System.out.print("저는 " + job + "로 일하고 있고, ");
		System.out.println("여기서는 " + subJob + "로 활동을 시작하려고 합니다.");
		System.out.println("제 정체성이자 목표는 " + identity + "!!");
		
		if( isMarried == true)
			System.out.println("그리고 얼마 전에 결혼한 새내기 유부남입니다 ㅎㅎ");
		else 
			System.out.println("난 솔로");
		
		System.out.println("앞으로 잘 부탁드립니다~!!");
	}
}
