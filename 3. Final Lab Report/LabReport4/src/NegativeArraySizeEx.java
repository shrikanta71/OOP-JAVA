public class NegativeArraySizeEx {

    public static void main(String[] args) {

        try{
            int[] a = new int[-5];
        }

        catch(NegativeArraySizeException e){
            System.out.println("This is Negative Array Size Exception from catch.\n");
        }

        finally {
            System.out.println("The exception is Negative array size from finally.");
        }
    }
}