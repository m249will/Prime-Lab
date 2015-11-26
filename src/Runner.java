// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Runner
{
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

    public static void computePrimes(boolean primes[])
    {
        for(int k=0; k < 100; k++){
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
                System.out.print(k + " ");}
            //else if(primes[k] == false){
            //    System.out.print("{" + k + "}");}
        }

    }
}
