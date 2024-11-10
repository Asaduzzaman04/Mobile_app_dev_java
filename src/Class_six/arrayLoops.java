package Class_six;

public class arrayLoops {
    public static void main(String[] args) {
        // initialize an array
        String[] name = {"sajid", "salman", "aziz", "mahdi", "arif"};
        //iterate array by for each  loops
        for (String i : name) {
            System.out.println(i);
        }

//multidimensional array

        int[][] age = new int[4][5];
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                System.out.print(age[i][j]);
                System.out.println("");
            }
            System.out.println("executed");
        }



    }
}