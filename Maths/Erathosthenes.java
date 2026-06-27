public class Erathosthenes {
    public static void main(String[] args) {
        int n = 50; // change this value to generate primes up to n
        boolean[] isPrime = sieveOfEratosthenes(n);
        System.out.println("Primes up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        if (n < 2) {
            return isPrime;
        }
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        return isPrime;
    }
}