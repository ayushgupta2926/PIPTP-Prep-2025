public class Q15 {
    // Recursive function that prints x after calling f(x / 2) if x >= 1
    public static void f(int x) {
        if (x < 1) {
            return;
        }
        f(x / 2);
        System.out.println(x);
    }

    public static void main(String[] args) {
        f(8);
    }
}