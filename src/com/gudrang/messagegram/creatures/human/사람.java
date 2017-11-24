package com.gudrang.messagegram.creatures.human;

import java.util.HashMap;
import java.util.Iterator;

import com.gudrang.messagegram.creator.authority.권한;
import com.gudrang.messagegram.creator.authority.다스림;
import com.gudrang.messagegram.creator.authority.자유;
import com.gudrang.messagegram.creatures.작품;
import com.gudrang.messagegram.hell.죄;

public class 사람 extends 작품 implements 죄 {
	
	private static HashMap<권한, Boolean> authorities;
	
	public 사람() {
		authorities = new HashMap<>();
	}

	public void setAuthority_관리인(다스림 managing) {
		authorities.put(managing, true);
	}
	
	public void setAuthority_자유(자유 free) {
		authorities.put(free, false);
	}
	
	public void select() {
		boolean isFree = authorities.get(new 자유());
		if( isFree)
			isGood = false;
	}
}
