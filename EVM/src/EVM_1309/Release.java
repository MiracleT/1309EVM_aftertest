package EVM_1309;

public class Release extends BallotButtonState {

	Release(){
		statename="Unpressed";
	}
	@Override
	public void switchState(Context c) {
		ct = new Off();
		 ct.working(lf.getType("BusyLamp"));
		System.out.println("\nCU:Presiding officer yet to press BallotButton ."+statename);
		 Press p=new Press();
		 c.setBb(p);
		 System.out.println("now "+c.getBb().statename);
		 p.switchState(c);
		
	}
}
