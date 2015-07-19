package EVM_1309;

public class Main {

	public static void main(String[] args) {
		//setup
		EVM e=new EVM();
		e.setUp(3);
		
		//polling
		CandidateButton b = new CandidateButton();
		b.press(1);
		b.press(2);
		//Check total poll count
		new TotalButton().onPress();
		b.press(1);
		new TotalButton().onPress();
		
		
		//close
		new CloseButton().onPress();
		b.press(0);
		
		//admin-->view result
				new ResultButton().onPress(); 
				
		//clear data
				new ClearButton().onPress();
				new ResultButton().onPress(); 
		
	}

}
