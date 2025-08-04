public class Q3 {
    // Recursive function to sum n + (n-2) + (n-4) + ... down to 0
    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + f(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(6));
    }
}