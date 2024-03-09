//testing variables
public class varTest {
    int num = 9;
    public int method1 (int num){
        this.num = num + (num*4);
        return num;
    }

    public void dispmet (){
        int num = 5;
        System.out.println(this.num + " and " +

                method1(num) + " and " + this.num);
    }

    public static void main(String[] args) {
        varTest x = new varTest();
        x.dispmet();
    }
}
