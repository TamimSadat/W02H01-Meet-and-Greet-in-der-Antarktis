package pgdp.warmup;

public class PenguWarmup {

	/*	Die Inhalte der main()-Methode beeinflussen nicht die Bewertung dieser Aufgabe
	 *	(es sei denn natürlich, sie verursachen Compiler-Fehler).
	 */
	public static void main(String[] args) {

		// Here is a place for you to play around :)

		//penguInfoOut(6);
		//System.out.println(penguEvolution(9, 10));
		System.out.println(penguPowers(4,2));
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
		return 0;
	}

	public static long penguPermutation(long n, long k) {
		// TODO
		return 0;
	}

	public static long penguPowers(int x, int i) {
		// TODO
		int base = x;
		int power = i;
		for (int n = 1; n < power; n++) {
			int y = x;
			for (int k = 1; k < base; k++) {
				x = x + y;
			}
		}
		return x;
	}



}
