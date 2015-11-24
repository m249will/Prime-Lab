
public class Runner {
	public static void main(String[] args) 
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in); 
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

}
