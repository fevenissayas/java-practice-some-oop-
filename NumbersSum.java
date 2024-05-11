import java.util.Arrays;
import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("where should your range start from: ");
        int starts = sc.nextInt();
        System.out.println("where should it end: ");
        int ends = sc.nextInt();

        //Sn = (n/2) [2a + (n - 1)d]
        sum = (ends-starts+1)/2* ((2*starts) + (ends-starts));
        System.out.println(sum);
        }
    }


