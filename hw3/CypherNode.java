public class CypherNode {
	private int numberOfAppearances;
	private float percentAppearances;

	public CypherNode(int numberOfAppearances) {
		this.numberOfAppearances = numberOfAppearances;
	}

	public void increment() {
		numberOfAppearances += 1;
	}

	public void updatePercentage(float newPercentage) {
		percentAppearances = newPercentage;
	}

	public int returnAppearances() {
		return numberOfAppearances;
	}

	public float returnPercentage() {
		return percentAppearances;
	}
}