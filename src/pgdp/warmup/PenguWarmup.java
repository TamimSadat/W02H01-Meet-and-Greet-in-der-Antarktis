package pgdp.warmup;

public class PenguWarmup {

	/*	Die Inhalte der main()-Methode beeinflussen nicht die Bewertung dieser Aufgabe
	 *	(es sei denn natürlich, sie verursachen Compiler-Fehler).
	 */
	public static void main(String[] args) {

		// Here is a place for you to play around :)

		//penguInfoOut(6);
		//System.out.println(penguEvolution(9, 10));
		//System.out.println(penguPowers(23,5));
		System.out.println(penguSum(128));
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

	public static int penguEvolution(int penguin, int years) {
		// TODO
		int n;
		for (n=0;n < years;n++){
			int k;
			int x = 1;
			for (k=0;x < penguin;k++) {
				x = 2 * x;
			}
			if (penguin <= 0) {
				System.out.println("Penguin " + penguin + " is not a known penguin!");
			}
			else if (penguin % 2 == 0) {//Mann
				if (penguin == x) {
						penguin = 1;
						 //Wenn Male Penguin Zahl gleich einer Zweierpotenz dann 1.
					}
				else {
						penguin = penguin / 2;
						//Ansonsten wird Male Penguin Zahl halbiert.
					}
				}
			else if (penguin % 7 == 0) {
				n += 6;
				if (n<years) {
					penguin = penguin * 3 + 1;
				}
				else {
					return penguin;
				}
			}
			else {
				penguin = penguin * 3 + 1;
			}

		}
		return penguin;
	}



	public static int penguSum(int penguin) {
		// TODO
		int x = 0; //x stellt die Summe dar.
		while (penguin != 0) {
			x += penguin % 10;
			penguin /= 10;
		}
		return x;
	}

	public static long penguPermutation(long n, long k) {
		// TODO
		return 0;
	}

	public static long penguPowers(int x, int i) {
		// TODO
		if (i == 0) {
			return 1;
		}
		else {
		int base = x;
		for (int n = 1; n < i; n++) {
			int x2 = x;
			for (int k = 1; k < base; k++) {
				x = x + x2;
			}
		}
		return x;
	}
	}



}
