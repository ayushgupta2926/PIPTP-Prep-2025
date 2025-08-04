public class Q10 {
    // Recursive function to print numbers from n down to 1
    public static void reversePrint(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        reversePrint(n - 1);
    }

    public static void main(String[] args) {
        reversePrint(3);
    }
}