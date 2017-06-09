import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	BowlingGame bg = new BowlingGame();
	Frame fr = new Frame();

	@Test
	public void testingIfStrikeIsWorking() {
		fr = new Frame(10,0);
		assertTrue(isStrike());
	}

}
