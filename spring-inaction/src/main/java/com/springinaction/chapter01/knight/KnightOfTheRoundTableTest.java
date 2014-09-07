package com.springinaction.chapter01.knight;

import junit.framework.TestCase;

public class KnightOfTheRoundTableTest extends TestCase {
	
	public void testEmbarkOnQuest() throws QuestFailException{
		KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Bedivere");
		
		HolyGrail grail = (HolyGrail) knight.embarkOnQuest();
		
		assertNotNull(grail);
		
		assertTrue(grail.isHoly());
	}
	

}
