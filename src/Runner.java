// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.

//Works with user input but I could not get the decimal format to work
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ==>>  ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        for(int k=0; k < primes.length; k++){
            primes[k] = true;}
        for(int p = 2; p < primes.length; p++){
            for(int q = 2; q < primes.length; q++){
                if(p*q < primes.length)
                    primes[p*q] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        computePrimes(primes);
        for(int k = 2; k < primes.length; k++){
            if(primes[k] == true){
                System.out.print(k + " ");
            }
        }
    }
}
