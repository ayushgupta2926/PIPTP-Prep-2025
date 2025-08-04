public class Q13 {
    // Recursive function that calls fun(n-1) twice and prints n after both calls
    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        fun(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(2);
    }
}