public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int y = x;
        int sum = 0;
        for (int i = String.valueOf(x).length() - 1; i >= 0; i--) {
            int rem = x % 10;
            x = x / 10;
            sum = sum * 10 + rem;
        }
        System.out.println(y == sum);
    }
}