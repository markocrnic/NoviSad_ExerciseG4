import java.util.ArrayList;
import java.util.List;

import com.sun.glass.ui.Size;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int bonusPoints=0;
	private int score = 0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size()<10){
			frames.add(frame);
		}
		else{
			throw new BowlingException("Maximum frames are added!");
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	
	// Returns the game score
	public int score(){
		for (Frame frame : frames) {
			score += frame.score();
		}
		return score;
	}
	
	public int scoreBonus(){
		for(int i = 1; i<frames.size(); i++){
				
			bonus = frames.get(i);
			if(frames.get(i-1).isStrike()&&frames.get(i-1)!=frames.get(9)){
				bonusPoints += bonus.getFirstThrow() + bonus.getSecondThrow();
			}
			else if(frames.get(i-1).isSpare()&&frames.get(i-1)!=frames.get(9)){
				bonusPoints += bonus.getFirstThrow();
			}else if(frames.get(i).isStrike()&&frames.get(i) == frames.get(9)){
				bonusPoints += bonus.score();
			}else if(frames.get(i).isSpare()&&frames.get(i) == frames.get(9)){
				bonusPoints += bonus.score() + bonus.getThirdThrow();
			}
			
		}
		return score() + bonusPoints;
	}

	public int getFrames() {
		return frames.size();
	}
}
