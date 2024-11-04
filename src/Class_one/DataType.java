package Class_one;

public class DataType {
    public static void main(String[] args) {
        // byte take 1 byte == 8 bits ; It’s an 8-bit signed integer, meaning it can represent values
        // from -128 to 127 [2^8 / 2] == 127
        //byte age = 20, id = 10; // single data type takes multiple variable
        byte age = 20;

        System.out.println("Its and byte data type\n" + age);

        // int take 4 byte == 32 bi; It’s an 32 bits signed integer;
        // The int type is suitable for most general-purpose calculations where the values fit within the specified range. It’s commonly used for counting, indexing, or any numerical data that does not exceed its limits.
        int number = 4251;
        System.out.println("Its an int data type\n" + number);


        //float occupies 4 bytes == 32 bits of memory.
        // Its approximately 6 to 7 decimal digits of precision. ex => 2334323.343f valid
        //To define a float variable, you must suffix the value with an f or F; otherwise, Java treats decimal literals as double by default.
        float flot = 34.324f; // Defining a float value with an 'f' suffix
        System.out.println("its and floating number\n" + flot);

        //double occupies 8 byte == 64 bits of memory; Java treats decimal literals as double by default.
        double dualNam = 10.343; // Defining a double value with an 'D' suffix
        System.out.println("Its an double number\n" + dualNam);

        //boolean occupies 1 byte == 8 bits of memory
        boolean isStudent = true;
        System.out.println("Its an boolean value \n" + isStudent);

        //long occupies 8 bytes ==  64 bits of memory.  suffix it with an L
        long population = 7830000000L;    //The default value of a long variable is 0L.
        System.out.println("Its an long value\n" + population);


    }
}


