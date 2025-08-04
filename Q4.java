public class Q4 {
    // Recursive function that prints numbers from 1 to x
    public static void fun(int x) {
        if (x == 0) {
            return;
        }
        fun(x - 1);
        System.out.println(x);
    }

    public static void main(String[] args) {
        fun(3);
    }
}