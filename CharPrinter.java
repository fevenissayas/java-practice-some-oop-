public class CharPrinter {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        // Loop through each string in strs array
        for (int i = 0; i < strs.length; i++) {
            System.out.println("String: " + strs[i]);

            // Loop through each character in the current string strs[i]
            for (int j = 0; j < strs[i].length(); j++) {
                // Print each character in the current string
                char result = strs[i].charAt(j);
                System.out.println("Character: " + result);
            }
        }
    }
}
