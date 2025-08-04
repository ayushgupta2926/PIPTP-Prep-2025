public class Q14 {
    // Recursive function to calculate the product of digits of n
    public static int productOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(productOfDigits(123));
    }
}