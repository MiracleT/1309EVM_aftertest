package EVM_1309;

public class OnLamp extends Lamps{
	@Override
	public void on() {
		System.out.println("CU: OnLamp Glowing\n");
	}

	@Override
	public void off() {
		System.out.println("CU onLamp OFF");
	}
}
