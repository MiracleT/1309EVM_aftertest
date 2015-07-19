package EVM_1309;

public class Voting extends BallotButtonState {

	Voting(){
		statename="VoterIsVoting";
	}
	@Override
	public void switchState(Context c) {
		System.out.println("CU:Awaiting voter action .Vote Now "+statename);
		
		 Release r=new Release();
		 c.setBb(r);
		 System.out.println("now "+statename);
		 
		CandidateButton.allow=true;
		// c.switchS();
		 
		
	}

}
