package com.gudrang.messagegram.heaven;

import java.util.ArrayList;
import java.util.List;

import com.gudrang.messagegram.creatures.human.사람;

public class 하나님_나라{
	
	List<사람> citizens;
	
	public 하나님_나라() {
		citizens = new ArrayList<>();
	}
	
	public void beACitizen(사람 child) {
		citizens.add(child);
	}
	
	public void show구원받은사람들() {
		for( int cnt=0; cnt<citizens.size(); cnt++) {
			System.out.println("구원 받은 사람 : " + citizens.get(cnt));
		}
	}
}
