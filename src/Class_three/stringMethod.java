package Class_three;

public class stringMethod {
    public static void main(String[] args) {
        String name = "david  jack"; // create a string;
        int stringLength = name.length(); // string length;
        String upperCase = name.toUpperCase();// uppercase the string;
        String lowerCase = name.toLowerCase(); //lowercase the number;
        String toTrim = name.trim(); //trim all whiteSpaces;
        String SubString = name.substring(1); // it takes index of string and print till end;
        String stringReplace = name.replace("id", "il"); // its take old char and replace it into new char
        System.out.println(name.startsWith("david")); // its return boolean value;
        System.out.println(name.endsWith("david")); // its return boolean value;
        int stringIndex = name.indexOf("a"); //  it takes char and return the index number;
        System.out.println(name.charAt(0));

    }
}