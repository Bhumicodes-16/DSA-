public class Countdigits {
    public static void main(String[] args) {
        Countdigits obj = new Countdigits();
        System.out.println(obj.CountDigits(12345)); // Output: 5
    }

    public int CountDigits(int x) {
        int res = 0;
        while (x > 0) {
            x = x / 10;
            res++;
            }
            return res;
        }
    }
