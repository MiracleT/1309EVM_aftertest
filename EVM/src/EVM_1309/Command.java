package EVM_1309;

public abstract class Command {
	BU bu = new BU();
	Lamps l;

	public abstract void working(Lamps lamps);
}
