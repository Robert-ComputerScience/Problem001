public class Problem01
{


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




    }










}
