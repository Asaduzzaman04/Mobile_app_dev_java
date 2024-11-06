package Java_Basic_Assignment;

public class cgpaCalculation {
    public static void main(String[] args) {
        double[] totalMarks = {3.5, 4.0, 3.2, 3.8};
        int[] creditHours = {3, 4, 2, 3};
        double totalGradePoints = 0;
        int totalCreditHours = 0;


        for (int i = 0; i < totalMarks.length; i++) {
        totalGradePoints = totalMarks[i] * creditHours[1];
    totalCreditHours = creditHours[i];
        }

double cgpa = totalGradePoints / totalCreditHours;
        System.out.printf("CGPA: %.2f", cgpa);

    }
}