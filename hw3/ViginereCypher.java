public class ViginereCypher {
	private final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;
	private String cypherText;
	private String plainText;
	private String keyword;
	

	public static void main(String[] args) {
		ViginereCypher v1 = new ViginereCypher("attackatdawn", "hello");
		ViginereCypher v2 = new ViginereCypher("hellomynameisjeff", "agoodkey");
		ViginereCypher v3 = new ViginereCypher("mamailoveyou", "gains");
		ViginereCypher v4 = new ViginereCypher("yolo", "hi");
	
		v1.print();
		v2.print();
		v3.print();
		v4.print();
	}

	public ViginereCypher(String plainText, String keyword) {
		if (keyword.length() > plainText.length()) {
			throw new IllegalArgumentException("keyword cannot be longer than plaintext");
		}

		this.plainText = plainText;
		this.keyword = keyword;
		char[][] viginereSquare = populateViginereSquare();
		encrypt(plainText, keyword, viginereSquare);
	}

	public char[][] populateViginereSquare(){
		char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[][] viginereSquare = new char[NUMBER_OF_LETTERS_IN_ALPHABET][NUMBER_OF_LETTERS_IN_ALPHABET];

		for (int i = 0;i <NUMBER_OF_LETTERS_IN_ALPHABET ;i++ ) {
			for (int j = 0;j <NUMBER_OF_LETTERS_IN_ALPHABET ;j++ ) {
				viginereSquare[i][j] = letters[(i + j) % NUMBER_OF_LETTERS_IN_ALPHABET];
			}
		}
		return viginereSquare;
	}

	public void encrypt(String plainText, String keyword, char[][] viginereSquare) {
		String key = keyword;
		String cypherText = "";

		int charactersToCopy = plainText.length() - keyword.length();
		
		for (int i = 0;i <  charactersToCopy;i++ ) {
			key += plainText.charAt(i);
		}

		for (int i = 0; i < key.length() ;i++ ) {
			char letterX = plainText.charAt(i);
			char letterY = key.charAt(i);
			int xIndex = 0;
			int yIndex = 0;

			for (int j = 0; j < NUMBER_OF_LETTERS_IN_ALPHABET; j++ ) {
				if (viginereSquare[0][j] == letterX) {
					xIndex = j;
				}
				if (viginereSquare[0][j] == letterY) {
					yIndex = j;
				}
			}
			cypherText += viginereSquare[xIndex][yIndex];
		}

		this.cypherText = cypherText;
	}

	public void print() {
		System.out.println("plaintext: " + plainText + "\nkeyword: " + keyword + "\ncypherText: " + cypherText + "\n") ;
	}

}