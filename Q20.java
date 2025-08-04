public class Q20 {
    // Recursive function to calculate double factorial of n
    public static int doubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(doubleFactorial(5));
    }
}