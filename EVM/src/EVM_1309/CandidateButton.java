package EVM_1309;

import java.util.ArrayList;



public class CandidateButton {

	static ArrayList <String> candidateButton = new ArrayList<String>();
	LampFactory lf = new LampFactory();
	Command c;
	static boolean allow;

	public void enable(String b) {
		candidateButton.add(b);
		System.out.println("\t" +b);

	}
	Voting v=new Voting();
	public void press(int i) {
	
 if(allow)	{	
		if(i<=candidateButton.size())
			System.out.print("\npressed "+candidateButton.get(i)+". Num:"+i+" ");
		else
			System.out.println("This is an non functional button");

		c= new On();
		c.working(lf.getType("CandidateLamp"));
		new ResultButton().submit(new BallotPaperScreen().getSymbol(i));
		
		

	}
	
	else
		System.out.println("VOTING CLOSED");
		
	}
}
