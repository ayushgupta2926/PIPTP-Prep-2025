public class Q7 {
    // Recursive function: fun(n) = fun(n-1) + fun(n-3), base case for n <= 1
    public static int fun(int n) {
        if (n <= 1) {
            return n;
        }
        return fun(n - 1) + fun(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}