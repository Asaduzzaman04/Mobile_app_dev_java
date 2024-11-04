package Class_one;
import java.util.Random;

public class RandomHexCode {
    public static void main(String[] args){
        String[] hexCode =  {"1","2","3","4","5","6","7","8","9","A","B","C",",D","E","F",};
        StringBuilder code  = new StringBuilder("#");
        Random number = new Random();
        for (int i = 0; i < 6; i++) {
          int index =   number.nextInt(hexCode.length);
         code.append(hexCode[index]);
        }
       String hex =  code.toString();
        System.out.println(hex);

    }
}