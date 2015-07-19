package EVM_1309;

public class CloseButton extends Buttons{

	@Override
	public void onPress() {
		CandidateButton.allow=false;
		System.out.println("No more voting!!!!!!!!!!!!!!!");
		
	}

}
