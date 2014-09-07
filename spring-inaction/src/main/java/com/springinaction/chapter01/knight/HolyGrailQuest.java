package com.springinaction.chapter01.knight;

public class HolyGrailQuest implements Quest{

	public HolyGrailQuest() {}
	
	public Object embark() throws QuestFailException{
		// Faca o que for preciso mara embarcar num retorno de jornada		
		return new HolyGrail();
	}
	

	
}
