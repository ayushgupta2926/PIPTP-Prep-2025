public class Q8 {
    // Recursive function that calls fun(n-1) twice for n > 0
    public static void fun(int n) {
        if (n == 0) {
            return ;
        }
        fun(n - 1);
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(3); // Example call
    }
}