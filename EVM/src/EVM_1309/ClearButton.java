package EVM_1309;

public class ClearButton extends Buttons{

	@Override
	public void onPress() {
		System.out.println("cleared data");
	ResultButton rs=new ResultButton();
	rs.vote=0;
	ResultButton.count=0;
	ResultButton.symbol=null;
	ResultButton.hm.clear();
	}


}
