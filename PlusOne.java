import java.util.Arrays;

class Solution {
    static int[] solution () {
        int [] digits = {9,9,9};
        for (int x = digits.length - 1; x >= 0; x--){
            if (digits[x] < 9) {
                digits[x]++;
                break;
            }
            digits [x] = 0;
        }
        System.out.println(Arrays.toString(digits));
        int [] newDig = new int [digits.length + 1];
        newDig [0] = 1;
        return newDig;
    }
    public static void main (String[] args){
        int [] result = solution();
        System.out.println(Arrays.toString(result));

    }
}