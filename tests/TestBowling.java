import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	BowlingGame bg;
	Frame fr;

	@Test
	public void testingIfStrikeIsWorking() {
		fr = new Frame(10,0);
		assertTrue(fr.isStrike());
	}
	
	@Test
	public void testingIfSpareIsWorking() {
		fr = new Frame(5,5);
		assertTrue(fr.isSpare());
	}
	
	@Test
	public void testingIfFrameReturnsScore(){
		fr = new Frame(4,3);
		assertEquals(7, fr.score());
	}

}
