class calcMod {
	
	public static void main(String[] args) {
		int base = Integer.parseInt(args[0]);
		int exponent = Integer.parseInt(args[1]);
		int mod = Integer.parseInt(args[2]);

		System.out.println((int)Math.pow(base, exponent) % mod);
	}
}