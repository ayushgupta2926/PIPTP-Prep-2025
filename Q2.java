public class Q2 {
    // Recursive function to multiply a and b using addition
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + mystery(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(mystery(3, 4));
    }
}