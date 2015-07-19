package EVM_1309;

public class TotalButton extends Buttons{

	@Override
	public void onPress() {
      System.out.println("\n##################So far  the polling count="+(new ResultButton().getCount()-1));
		
	}

}
