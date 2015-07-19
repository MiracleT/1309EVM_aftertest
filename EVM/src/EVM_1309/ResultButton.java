package EVM_1309;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultButton extends Buttons {
int vote;
static String symbol;
static int count;
static HashMap<String,Integer> hm = new HashMap<String, Integer>();
	public void submit(String symbol) {
		ResultButton.symbol=symbol;
		System.out.print("submitted not accounted");
		new Context(new Release()).switchS(); 
	
	}
	public int release() {
		if(count<1){
		System.out.println("Initiating");
		count++;
		return 0;
		}
		else{
		if(hm.get(symbol)==null)
			vote=1;
		else
		vote=hm.get(symbol)+1;
		hm.put(symbol,vote);
		System.out.print("submitted and accounted");
		count++;
	}
		return 1;
	}
	
	@Override
	public void onPress() {
		List<String> keys = new ArrayList<String>();
		keys.add("LOTUS");
		keys.add("HAND");
		keys.add("DOLL");
		System.out.println("*********************RESULT***********************\n");
		for (String key: keys) {
		    System.out.println("\t\t"+key + "\t: " + hm.get(key));
		System.out.println();
	}
	}
	public int getCount() {
		return count;
	}

}
