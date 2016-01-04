public class cypherNode {
	private int numberOfAppearances;
	private float percentAppearances;

	public CypherNode(int numberOfAppearances) {
		this.numberOfAppearances = numberOfAppearances;
	}

	public increment() {
		numberOfAppearances += 1;
	}

	public updatePercentage(int numberLettersInCypher) {
		percentAppearances = (float)numberOfAppearances / numberLettersInCypher
	}
}