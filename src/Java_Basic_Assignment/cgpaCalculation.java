package Java_Basic_Assignment;

import java.util.Scanner;

public class cgpaCalculation {
    public static void main(String[] args) {
        double[] totalMarks = {3.0, 4.0, 2.2, 3.8};
        int[] creditHours = {3, 4, 2, 3};
        double totalGradePoints = 0;
        int totalCreditHours = 0;
        for (int i = 0; i < totalMarks.length; i++) {
            totalGradePoints += totalMarks[i] * creditHours[i];
            totalCreditHours += creditHours[i];
        }
        double cgpa = totalGradePoints / totalCreditHours;
        System.out.printf("CGPA : %.2f", cgpa);
    }
}