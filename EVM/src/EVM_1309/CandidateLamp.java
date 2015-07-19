package EVM_1309;

import java.util.ArrayList;

public class CandidateLamp extends Lamps{
	
	ArrayList <String> candidateLamp = new ArrayList<String>();
	@Override
	public void on() {
		System.out.println("Candidate Lamp Glowing: CHOICE REGISTERED");
	}

	@Override
	public void off() {
		System.out.println("Candidate Lamp Off: VOTER MAY LEAVE");
	}

	public void enable(String s) {
		candidateLamp.add(s);
		System.out.print("\t" +s);		
	}


}
