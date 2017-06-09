import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import jdk.nashorn.internal.ir.ThrowNode;

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
	
	@Test
	public void testIfAddingFrameIsWorking() throws BowlingException{
		fr = new Frame(4,3);
		bg = new BowlingGame();
		bg.addFrame(fr);
		assertEquals(1, bg.getFrames());
	}
	
	@Test(expected = BowlingException.class)
	public void testIfAddingMoreThan10FramesThrowsException() throws BowlingException{
		Frame fr1 = new Frame(1,1);
		Frame fr2 = new Frame(1,1);
		Frame fr3 = new Frame(1,1);
		Frame fr4 = new Frame(1,1);
		Frame fr5 = new Frame(1,1);
		Frame fr6 = new Frame(1,1);
		Frame fr7 = new Frame(1,1);
		Frame fr8 = new Frame(1,1);
		Frame fr9 = new Frame(1,1);
		Frame fr10 = new Frame(1,1);
		Frame fr11 = new Frame(1,1);
	}
	

}
