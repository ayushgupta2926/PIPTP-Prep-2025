public class Q17 {
    // Recursive function to print numbers from n down to 1
    public static void countDown(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(3);
    }
}