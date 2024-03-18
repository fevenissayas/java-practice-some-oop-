public class multiD_array_practice {
    public static void main(String[] args) {
        int[][] sample = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for(int x = 0; x< sample.length; x++) {
            for(int y = 0; y< sample [x].length; y++) {
                System.out.println(sample[x][y]);
            }
        }
    }
}


//class Demo {
//    static void welcome() {
//        System.out.println("Welcome");
//        System.out.println("I am a method");
//        System.out.println("End of method");
//    }
//
//    public static void main(String[] args) {
//        welcome();
//        //some code
//        welcome();
//        welcome();
//    }
//}