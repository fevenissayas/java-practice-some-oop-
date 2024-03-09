public class UsingOperators {
//    public static void main(String[] args) {
//        for (String arg : args){
//            System.out.println(arg);
//        }
//    }
    int num = 9; // Instance variable

    public int process(int num) {
        this.num = num * 3;
        return num;
    }

    public void display() {
        System.out.println(process(5) + " and " + num);
    }

    public static void main(String[] args) {
        UsingOperators obj = new UsingOperators();
        obj.display();
    }
}