//printing index if the sum of those elements is equal with the output variable.

class TwoSum {
    static int [] solution () {
        int[] nums = {2,7,11,15};
        int output = 9;
        int [] result = new int[2];
        for (int x = 0; x<nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                int sum = nums[x] + nums[y];
                if (sum == output) {
                    result[0] = x;
                    result[1] = y;
                    break;
                }
            }
        }
        return result;
    }
    public static void main (String[] args){
        int [] temp = solution();
        System.out.println("["+ temp [0] +","+temp[1]+"]");

    }
}