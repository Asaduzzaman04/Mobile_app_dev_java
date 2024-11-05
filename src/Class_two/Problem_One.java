package Class_two;
public class Problem_One {
    public static void main(String[] args){
            //grade encrypt
        char encryptGrade = 'A';
        encryptGrade = (char)  (encryptGrade + 8); // ex A++ = B;
        System.out.println("encrypted grade\n" + encryptGrade);
        //grade decrypt
        char finalGrade = (char) (encryptGrade - 8);
        System.out.println("decrypted grade\n" + finalGrade);
    }
}