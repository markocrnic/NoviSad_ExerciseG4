public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int score = 0;
	private int bonus = 0;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		score = firstThrow + secondThrow;
		return score;
	}
	
	public int bonusScore(){
		if(isStrike()){
			bonus = 
		}
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(firstThrow+secondThrow == 10)
			return true;
		return false;
	}
}
