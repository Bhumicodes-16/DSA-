public class Primefac {
    public static void main(String[] args) {
        prime obj = new prime();
        System.out.println(obj.isPrime(17)); // Output: true
        System.out.println(obj.isPrime(18)); // Output: false
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}