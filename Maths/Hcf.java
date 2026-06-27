public class Hcf {
    public static void main(String[] args) {
        Hcf obj = new Hcf();
        System.out.println(obj.hcf(12, 18)); // Output: 6
    }

    public int hcf(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
} 