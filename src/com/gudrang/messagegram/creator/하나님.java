package com.gudrang.messagegram.creator;

import com.gudrang.messagegram.creator.authority.다스림;
import com.gudrang.messagegram.creator.authority.자유;
import com.gudrang.messagegram.creator.property.용서;
import com.gudrang.messagegram.creatures.시공간;
import com.gudrang.messagegram.creatures.작품_공방;
import com.gudrang.messagegram.creatures.작품_공방.작품_Builder;
import com.gudrang.messagegram.creatures.human.사람;
import com.gudrang.messagegram.heaven.하나님_나라;

public class 하나님 {
	
	private volatile static 하나님 여호와;
	
	private 하나님_나라 heaven;
	private 시공간 timeAndSpace;
	private 작품_공방 creature;
	
	public static synchronized 하나님 iAmWhoIam() {
		if( 여호와 == null)
			여호와 = new 하나님();
		return 여호와;
	}
	
	public void word() {
		// 세상의 모든 것을 창조하셨다.
		create();
	}
	
	protected void create() {
		heaven = new 하나님_나라();
		timeAndSpace = new 시공간(); 
		creature = new 작품_Builder()
				// 빛, 물, 하늘 등을 만드셨고... (창세기 1장에 있어요)
				.create_우주()
				.create_지구()
				.create_자녀()
				.create_교회()
				// 등등... 세상 모든 것!
				.build();
		timeAndSpace.put(creature);
		Thread thread = new Thread(timeAndSpace);
		thread.start();
	}
	
	protected void 구원( 사람 child) {
		heaven.beACitizen(child); // 이것은 예수님한테만
	}
	
	public 보시기에_좋음 receive_회개() {
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
	
	public 자유 giveAuthority_임의로_선택() {
		자유 free = new 자유();
		return free;
	}
	
	public 다스림 giveAuthority_다스림() {
		다스림 managing = new 다스림();
		return managing;
	}
}
