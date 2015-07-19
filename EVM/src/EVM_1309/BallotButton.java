package EVM_1309;


public class BallotButton {
	public void voteRelease(){
		ResultButton rb=new ResultButton();
		if(rb.release()==1)
		System.out.println("VOTE RELEASED");
	}


}
