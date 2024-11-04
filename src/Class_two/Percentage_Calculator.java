package Class_two;

public class Percentage_Calculator {
    public static void main(String[] args) {
        int[] marks = {57, 88, 58, 74}; // marks
        int totalMarks = 0;
        int totalPossibleMarks = 100 * marks.length; // Assuming each subject is out of 100

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i]; // loop for addition every marks
        }
        System.out.println("your total  marks =>" +  totalMarks);
        System.out.println("Percentage of marks");
        double percentage = (double) totalMarks / totalPossibleMarks * 100; // Percentage calculation
        System.out.println(percentage + "%"); // final result
    }
}