import java.util.*;

public class ThrowsEx {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if(number > 100 || number < 0){
            throw new ArithmeticException("Not valid");
        }
        else if(number < 40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass.");
        }
    }
}
