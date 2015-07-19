package EVM_1309;

public class Press extends BallotButtonState {

	Press(){
		statename="ReadyForVote";
	}
	@Override
	public void switchState(Context c) {
		System.out.println("CU:BALLOT BUTTON PRESSED. "+statename);
		BallotButton b=new BallotButton();
		b.voteRelease();
		 ct = new On();
		 ct.working(lf.getType("readyLamp"));
		 //voter votes
		 Voting v=new Voting();
		 c.setBb(v);
		 System.out.println("now "+statename);
         c.switchS();		
	}

}
