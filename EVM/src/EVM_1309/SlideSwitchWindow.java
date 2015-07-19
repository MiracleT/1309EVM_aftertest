package EVM_1309;

public class SlideSwitchWindow {

	private int candidateCount;
	private int sliderAt;

	public int getCandidateCount() {
		return candidateCount;
	}
	public void setCandidateCount(int candidateCount) {
		this.candidateCount = candidateCount;
		setSwitch();
	}
	public int getSliderAt() {
		return sliderAt;
	}
	public void setSliderAt(int sliderAt) {
		this.sliderAt = sliderAt;
	}
	public void setSwitch() {
		if(candidateCount>16){
			setSliderAt(2);
			System.out.println("Slider set to "+getSliderAt()+" ( Since Candidates contesting = "+getCandidateCount()+")");
		}else{
			setSliderAt(1);
			System.out.println("Slider set to "+getSliderAt()+" ( Since Candidates contesting = "+getCandidateCount()+")");
		}
	}
 
}
