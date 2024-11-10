package Class_five;

public class loops {
    public static void main(String[] args) {
        int age = 20;
        // for loops
        for (int i = 0; i <= age; i++) {
            System.out.println(i);
            if (i == 10) {
                System.out.println("loop end");
                break; // if the i value is equal to 10 i will return from loops

            }
        }
        //while loop
        int whileValue = 0;
        while (whileValue <= age) {
            System.out.println(whileValue + "this is whileValue");

            whileValue++;
            if (whileValue == 5) {
                System.out.println("continue start");
                continue; // it checks the  conditions if it true continue start didn't render the below code and
                // continue code again
            }
            System.out.println("with out continue it print");
        }
        //do while loops
        int doWhileValue = 0;
        do {
            System.out.println(doWhileValue + "this is do while value");
            doWhileValue++;
        } while (doWhileValue <= age);

    }
}