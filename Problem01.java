public class Problem01
{
    // Space complexity is the measure of how much space/memory an algorithm takes during execution
    // Space complexity = O(1) because no extra space is required for either methods
    // O(n)
    public static long getSumOfPrimes(int n)
    {
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
        //          Test your solution
        //          Analyze its space and time


        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) ) {
                sum += i;
                // do something
            }
        }
        return sum;
    }
    // because loop runs O(n) times and isPrime() inside the loop runs O(sqrt(n))
   // O(n * sqrt(n))
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {


        // getSumOfPrimes(5);
        boolean prime = isPrime(5);
        System.out.println(prime);

       long result = getSumOfPrimes(30);
       System.out.println(result);


    }










}
