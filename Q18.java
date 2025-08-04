public class Q18 {
    // Recursive function to calculate n - (n-1) + (n-2) - ... alternately
    public static int altSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n - altSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(altSum(5));
    }
}