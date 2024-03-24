import java.util.Arrays;
import java.util.ArrayList;

public class GradebookOO {
    double[] grades;

    public GradebookOO() {
        grades = new double[0];
    }

    public void printGrades() {
        for (double grade : grades) {
            System.out.println(grade);
        }
    }

    public double averageGrade() {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;
        return average;
    }

    public void addGrade(double grade) {
        double[] temp = new double[grades.length + 1];
        for (int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }
        temp[grades.length] = grade;
        grades = temp;
    }

    public void deleteGrade (double grade){
        int j = 0;
        double [] temp1 = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != grade)
                temp1[j++] = grades[i];
        }
        grades = temp1;
        System.out.println(Arrays.toString(grades));
    }
}
