package com.springinaction.chapter01.hello;

public class GrettingServiceImpl implements GrettingService {
	private String gretting;
	
	GrettingServiceImpl(){}
	GrettingServiceImpl(String gretting){
		this.gretting = gretting;
				
				
	}
	
	public void sayGretting() {
		System.out.println(gretting);
	}
	public void setGretting(String gretting) {
		this.gretting = gretting;
	}

}

 