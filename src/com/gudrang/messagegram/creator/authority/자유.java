package com.gudrang.messagegram.creator.authority;

public class 자유 extends 권한 {
	
	public void select() { // 임의로 선택할 수 있음 
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		권한 authority = (권한) obj;
		return authority instanceof 자유;
	}
}
