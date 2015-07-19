package EVM_1309;

public class BU {
	Command c;
	Lamps rl;
	SlideSwitchWindow ssw = new SlideSwitchWindow();
	BallotPaperScreen bp = new BallotPaperScreen();
	LampFactory lf = new LampFactory();
	CU cu = new CU();
	public void on(int candCount){
		bp.setUpScreen();
		ssw.setCandidateCount(candCount);
		System.out.println("BALLOT UNIT SWITCHED ON");
		c = new On();
		c.working(lf.getType("readyLamp"));
		enableRequired();
		cu.completeSetup(true);
			
	}


	private void enableRequired() {
	bp.viewSymbol();
	}
	
	

	
}
