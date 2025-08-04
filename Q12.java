public class Q12 {
    // Recursive function to calculate factorial of n
    public static int series(int n) {
        if (n == 1) {
            return 1;
        }
        return n * series(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(series(5));
    }
}