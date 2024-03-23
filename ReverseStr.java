public class ReverseStr {
    public static void main(String[] args) {
        String str = "code";
        int n, k = 5; // Assuming k = 5 for example
        n = str.length();
        String result = "";
        String first = str.substring(0, 1);
        String last = str.substring(n - 1);
        String answer = last + str.substring(1, n - 1) + first;

        System.out.println(answer); // Print the reversed string

        // Concatenate str to result in each iteration
        for (int i = 0; i < k; i++) {
            result += str;
            System.out.println(result); // Print result in each iteration
        }
    }
}
