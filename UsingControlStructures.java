import java.util.ArrayList;
import java.util.Scanner;

class UsingControlStructures {
    static void ControlStr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age to check if you're old enough to drive: \n");
        int age = sc.nextInt();
        if (age >= 18 && age <90) {
            System.out.println("you are old enough to drive");
        }else if (age>=90)
            System.out.println ("too old");
        else System.out.println ("not old enough");
    }
    static void ODD_FOR(){
        ArrayList <Integer> arr = new ArrayList<> ();
        int j = 0;
        for (int i = 100; i > 0 ; i--) {
            if (i%2 == 0) continue;
            arr.add(i);
        }
        System.out.println(arr);
    }
    static void ODD_WHILE () {
        int i = 100;
        ArrayList <Integer> arr2 = new ArrayList<>();
        while (i > 0){
            if (i%2 !=0) arr2.add(i);
            i--;
        }
        System.out.println(arr2);
    }
}
