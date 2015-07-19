package EVM_1309;

public class EVM {

	CU cu = new CU();
	BU bu = new BU();


	public void setUp(int candCount) {
		cu.on();
		bu.on(candCount);


	}

}
