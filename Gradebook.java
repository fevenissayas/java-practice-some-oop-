import java.util.Scanner;

public class Gradebook {
    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);

//        System.out.print("how many grades are you inserting? ");
//        int len = sc.nextInt();
//        double [] grade_arr = new double [len];
        double[] grade_arr = {65.2, 90.1, 80.0, 75.9};

        for (int i = 0; i < grade_arr.length && i < args.length; i++) {
            grade_arr[i] = Double.parseDouble(args[i]);
        }

        printGrades(grade_arr);
        averageGrade(grade_arr);

    }

    static void printGrades (double[] grade_arr){
        for (double grades : grade_arr) {
            System.out.println(grades);
        }
    }

    static void averageGrade (double[] grade_arr){
        double sum = 0;
        for (int i = 0; i < grade_arr.length; i++) {
            sum += grade_arr[i];
        }
        double average = sum/ grade_arr.length;
        System.out.printf("average grade: %.2f%n", average);

        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.printf("Your letter grade: %c", letterGrade);
    }
}
