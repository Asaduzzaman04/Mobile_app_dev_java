package  Class_three;
public class Conditional {
    public static void main(String[] args) {
        int num = 18;
    if (num >= 18){
        System.out.println("your age is " + num  + ", you can vote");
    }else {
        System.out.println("you are too young you can't vote");
    }
    switch (num){
        case 18 :
            System.out.println("your age is 18");
             break;
        case 10 :
            System.out.println("you are too young");
    }

    }
}