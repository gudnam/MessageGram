package com.gudrang.messagegram.creatures;

import com.gudrang.messagegram.creator.예수님;
import com.gudrang.messagegram.creator.하나님;
import com.gudrang.messagegram.creatures.human.굳랑;
import com.gudrang.messagegram.creatures.human.사람;

public class 시공간 implements Runnable {
	
	작품 creature;
	
	public void put(작품 creature) {
		this.creature = creature;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//while( !하나님.iAmWhoIam().isFinish()) {
			// 세월이 흘러가는중... 현재 주후 2016년
			사람 gudrang = new 굳랑();
			하나님 god = new 하나님();
			god.receive_회개();
			예수님 jesus = new 예수님();
			jesus.믿음(gudrang);
		//}
	}
}
