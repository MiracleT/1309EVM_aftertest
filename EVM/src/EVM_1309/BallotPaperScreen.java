package EVM_1309;

import java.util.ArrayList;

public class BallotPaperScreen {

	static ArrayList <String> candidatePaper = new ArrayList<String>();

	void setUpScreen(){
		candidatePaper.add("LOTUS");
		candidatePaper.add("HAND");
		candidatePaper.add("DOLL");
		System.out.println("Ballot paper placed and aligned");
		seal();
	}

	private void seal() {
		System.out.println("SEALED");

	}

	public void viewSymbol() {
		CandidateLamp cll =new CandidateLamp();
		CandidateButton cb =new CandidateButton();
	//	Command c=new On();
		System.out.println("\n");
		for(int i=0;i<candidatePaper.size();i++){
			System.out.print(candidatePaper.get(i));
			cll.enable("Lamp"+i);
			cb.enable("button"+i);
			//c.working(lf.getType("candidateLamp"));
		}
	}
		
		public String getSymbol(int i){
			//System.out.print(candidatePaper.get(i));
			return candidatePaper.get(i);
		}


}
