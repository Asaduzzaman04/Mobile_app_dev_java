package Class_six;
public class JavaArray {
    public static void main(String[] args) {
    //array in jav
        //first way
        int[] num; //array  declaration
        num = new int[6];// memory allocation
        //initialization
        num[0]  = 900;
        num[1]  = 220;
        num[2]  = 120;
        num[3]  = 520;
        num[4]  = 207;
        num[5]  = 200;
//        num[6] = 1000; //throw error

        //second way array declaration
        int [] age = {23,234,564,545,324324,32434}; //it will allocate in memory automatically

        //reverse an array
        int[]  id = {1,4,7,8,132,3,4,5};
        for (int i = id.length -1; i >= 0 ; i--) {
            System.out.println(id[i]);
        }

    }
}
