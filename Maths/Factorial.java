public class Factorial {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Factorial obj1 = new Factorial();

        System.out.println(obj.factorial(5));   // 120
        System.out.println(obj1.factorial1(10));  // 3628800
    }

    public int factorial(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;
    }

    public int factorial1(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial1(n - 1);
    }
}