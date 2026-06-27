public class Lcm {
    public static void main(String[] args) {
        Lcm obj = new Lcm();
        System.out.println(obj.lcm(12, 18)); // Output: 36
    }

    public int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
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