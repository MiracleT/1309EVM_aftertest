package EVM_1309;

public class Context {
	private BallotButtonState bb;

	public Context(BallotButtonState bb) {
		this.bb = bb;
	}

	public BallotButtonState getBb() {
		return bb;
	}

	public void setBb(BallotButtonState bb) {
		this.bb = bb;
	}

	void switchS(){
		bb.switchState(this);
	}
}
