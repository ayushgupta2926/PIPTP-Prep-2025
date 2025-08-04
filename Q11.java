public class Q11 {
    // Recursive function to calculate the nth Fibonacci number
    public static int foo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return foo(n - 1) + foo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(foo(4));
    }
}