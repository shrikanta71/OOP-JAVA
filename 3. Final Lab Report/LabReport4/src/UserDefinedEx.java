import java.util.*;

public class UserDefinedEx extends Exception{

    UserDefinedEx(String exception){

        System.out.println(exception);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try{
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if(a*b*c == 0){
                throw new UserDefinedEx("The multiplication can't be zero.\n");
            }

            System.out.println("There is no Exception.");
        }
        catch(UserDefinedEx e){
            System.out.println("This is a User Defined Exception.");
        }
    }
}
