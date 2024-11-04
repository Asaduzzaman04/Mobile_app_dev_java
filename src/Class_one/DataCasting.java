package Class_one;

public class DataCasting {
    public static void main(String[] args){
        //1. Widening Type Casting
        //2. Narrowing Type Casting

        //int number to double number;
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //double number to int numbers
        double doubleNum = 20.00;
        int intNum = (int) doubleNum; // Manual casting: double to int
        System.out.println(doubleNum);// Outputs 9.78
        System.out.println(intNum);// Outputs 9

         float myFloatNum = 10.222f; // Automatic casting: float  to double
        System.out.println(myFloatNum);// output => 10.222
         double floatToDouble =  myFloatNum;
        System.out.println(floatToDouble); // output => 10.222000122070312

    }
}