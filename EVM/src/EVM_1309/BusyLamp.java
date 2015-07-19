package EVM_1309;

public class BusyLamp extends Lamps{
	static int status;
		@Override
		public void on() {
			System.out.println("\tCU: BusyLamp Glowing....Voter Voting\n");
			status=1;
		}

		@Override
		public void off() {
			System.out.println("\tCU: BusyLamp OFF...beep beep");
			status=0;
		}
		
}
