package com.gudrang.messagegram.creatures;

import com.gudrang.messagegram.creator.하나님;
import com.gudrang.messagegram.creatures.human.사람;

public class 시공간 implements Runnable {
	
	작품_공방 creature;
	
	public void put(작품_공방 creature) {
		this.creature = creature;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		하나님 god = 하나님.iAmWhoIam();
		
		// 하나님은 그의 창조물 중에 인간을 특별히 여겨
		사람 child = (사람) creature.child;
		
		// 자유를 주셨고
		child.setAuthority_자유(god.giveAuthority_임의로_선택());
		
		// 세상을 다스릴 권세를 주셨다.
		child.setAuthority_관리인(god.giveAuthority_다스림());
		
		// 그러나...
		child.select();
	}
}
