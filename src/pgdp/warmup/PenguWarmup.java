package pgdp.warmup;

public class PenguWarmup {

	/*	Die Inhalte der main()-Methode beeinflussen nicht die Bewertung dieser Aufgabe
	 *	(es sei denn natürlich, sie verursachen Compiler-Fehler).
	 */
	public static void main(String[] args) {

		// Here is a place for you to play around :)

		//penguInfoOut(6);
		System.out.println(penguEvolution(128, 2));
	}

	protected PenguWarmup() {
		throw new UnsupportedOperationException();
	}

	public static void penguInfoOut(int penguin) {
		// TODO

		if (penguin < 0) {
			System.out.println("Penguin " + penguin + " is not a known penguin!");
		} else if (penguin % 2 == 0) {
			System.out.println("Penguin: " + penguin);
			System.out.println("This penguin is a male.");
		}
		else {
			System.out.println("Penguin: " + penguin);
			System.out.println("This penguin is a female.");
		}

	}
	public static boolean isPowerOfTwo(int n){
		while(n%2 == 0){
			n /= 2;
		}
		if(n == 1){
			return true;
		}
		return false;
	}

	public static boolean isPowerOfSeven(int n){
		while(n%7 == 0){
			n /= 7;
		}
		if(n == 1){
			return true;
		}
		return false;
	}
	public static int penguEvolution(int penguin, int years) {
		//for number of years
		for (int i = 0; i < years; i++) {
			if (penguin % 2 == 0 && isPowerOfTwo(penguin)) {
				penguin = 1;
			} else if (penguin % 2 == 0) {
				penguin = penguin / 2;
			} else if (penguin % 2 != 0 && isPowerOfSeven(penguin)) {
				penguin = 7;
			} else {
				penguin = (penguin * 3) + 1;
			}

		}
		return penguin;
	}

	public static int penguSum(int penguin) {
		// TODO
		return 0;
	}

	public static long penguPermutation(long n, long k) {
		// TODO
		return 0;
	}

	public static long penguPowers(int x, int i) {
		// TODO
		return 0;
	}



}
