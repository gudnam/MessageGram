package com.gudrang.messagegram.creator;

import com.gudrang.messagegram.creator.property.용서;
import com.gudrang.messagegram.creator.property.하나님의_성품;
import com.gudrang.messagegram.creatures.시공간;
import com.gudrang.messagegram.creatures.작품;
import com.gudrang.messagegram.creatures.작품.작품_Builder;
import com.gudrang.messagegram.creatures.human.사람;
import com.gudrang.messagegram.heaven.하나님_나라;

public class 하나님 {
	
	private volatile static 하나님 여호와;
	
	private 하나님_나라 heaven;
	private 시공간 timeAndSpace;
	private 작품 creature;
	
	public static synchronized 하나님 iAmWhoIam() {
		if( 여호와 == null)
			여호와 = new 하나님();
		return 여호와;
	}
	
	public void plan() {
		create();
		Thread thread = new Thread(timeAndSpace);
		thread.start();
	}
	
	protected void create() {
		heaven = new 하나님_나라();
		timeAndSpace = new 시공간(); 
		creature = new 작품_Builder()
				// 빛, 물, 하늘 등을 만드셨고... (창세기 1장에 있어요) // 순서 똑같이 적기
				.create_우주()
				.create_지구()
				.create_자녀() // 자녀란 말이 일반인들에게는 사람 혹은 나 자신이란걸 인식하지 못하지 않을
				.create_교회()
				// 등등... 세상 모든 것!
				.build();
		timeAndSpace.put(creature);
	}
	
	protected void 구원( 사람 child) {
		heaven.beACitizen(child); // 이것은 예수님한테만
	}
	
	public 하나님의_성품 receive_회개() {
		return new 용서();
	}
	
	public boolean isFinish() {
		return false;
	}
	
	public void hearVoices() {
		
	}
	
	private void sendJesus() {
		
	}
	
	private void loveMyChildren() {
		takeCare();
		guard();
	}
	
	private void takeCare() {
		
	}
	
	private void guard() {
		
	}
}
