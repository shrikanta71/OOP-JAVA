public class NegativeArraySizeEx {

    public static void main(String[] args) {

        try{
            int[] a = new int[-5];
            //System.out.println(a.length);
        }

        catch(NegativeArraySizeException e){
            System.out.println("This is Negative Array Size Exception.");
        }
    }
}
