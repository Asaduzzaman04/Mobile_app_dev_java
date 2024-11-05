package  Class_two;
import  java.time.Year; //get current year;
import  java.util.Scanner; //import a Scanner class from java;
public class UserInput {
    public static void main(String[] args){

        //users age calculation
        int currentYear  = Year.now().getValue(); //get current year
        System.out.println("current year =>" + currentYear);
        Scanner userBirthYear = new Scanner(System.in); // it defines (System.in) data from user Data
        System.out.println("Enter your Birth year");
        int userBirthYearIn = userBirthYear.nextInt(); // take value form users putted
        int userAge = currentYear - userBirthYearIn;
        System.out.println( "your age is =>  " + userAge);
    }
}