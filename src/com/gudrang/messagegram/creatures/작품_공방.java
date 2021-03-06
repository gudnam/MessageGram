package com.gudrang.messagegram.creatures;

import com.gudrang.messagegram.creatures.human.사람;
import com.gudrang.messagegram.creatures.object.교회;
import com.gudrang.messagegram.creatures.object.빛;
import com.gudrang.messagegram.creatures.object.우주;
import com.gudrang.messagegram.creatures.object.지구;

public class 작품_공방 {
	
	작품 light;
	작품 space;
	작품 earth;
	작품 child;
	작품 church;
	
	protected 작품_공방() { }
	public 작품_공방( 작품_Builder builder) {
		this.light = builder.light;
		this.space = builder.space;
		this.earth = builder.earth;
		this.child = builder.child;
		this.church = builder.church;
	}
	
	public static class 작품_Builder {
		
		작품 light;
		작품 space;
		작품 earth;
		작품 child;
		작품 church;

		public 작품_Builder create_빛() {
			this.light = new 빛();
			return this;
		}
		
		public 작품_Builder create_우주() {
			this.space = new 우주();
			return this;
		}
		
		public 작품_Builder create_지구() {
			this.earth = new 지구();
			return this;
		}
		
		public 작품_Builder create_자녀() {
			this.child = new 사람();
			return this;
		}
		
		public 작품_Builder create_교회() {
			this.church = new 교회();
			return this;
		}
		
		public 작품_공방 build() {
			return new 작품_공방( this);
		}
	}
}
