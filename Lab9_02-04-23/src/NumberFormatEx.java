public class NumberFormatEx {

    public static void main(String[] args) {

        try{
            String a = "xyz";
            int n = Integer.parseInt(a);
        }

        catch(NumberFormatException e){
            System.out.println("This is Number Format Exception.");
        }
    }
}
