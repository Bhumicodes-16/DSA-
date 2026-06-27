public class Euclidean {
    public static void main(String[] args) {
        Euclidean obj = new Euclidean();
        System.out.println(obj.euclidean(48, 18)); // Output: 6
    }

    public int euclidean(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidean(b, a % b);
    }
}