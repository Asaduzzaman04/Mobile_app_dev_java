package  Class_five;
public class loops {
    public static void main(String[] args) {
    int age = 20;
    // for loops
        for (int i = 0; i <= age; i++) {
            System.out.println(i);
        }
        //while loop
        int whileValue = 0;
        while(whileValue <= age){
            System.out.println(whileValue  + "this is whileValue");
            whileValue++;
        }
    //do while loops
        int doWhileValue = 0;
        do {
            System.out.println(doWhileValue + "this is do while value");
            doWhileValue++;
        }while (doWhileValue <= age);

    }
}