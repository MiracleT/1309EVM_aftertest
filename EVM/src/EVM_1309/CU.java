package EVM_1309;

public class CU {
Command c;
LampFactory lf = new LampFactory();
	public void on() {
		c = new On();
		c.working(lf.getType("OnLamp"));
	}
	public void completeSetup(boolean b) {
		Context c= new Context(new Release());
	if(b)
		c.switchS();
	else
		System.out.println("NOT READY TO BEGIN VOTING");
		
	
		
	}

}
