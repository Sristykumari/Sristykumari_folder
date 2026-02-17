public class PrimeNumer {
    public static void main(String[] args) {
        int n = 29; // Example number to check for primality
        boolean isPrime = true;
        int flag = 1;
        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // n is divisible by a number other than 1 and itself
                    break;
                }
            }
        }
        if(flag == 1) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
