public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try{
//            int x = 10/0;
//
//            int[] a = new int[5]
//            System.out.println(a[6]);
//
//            String n = null;
//            System.out.println(n.length());
//
//            int[] b = new int[-5];

            String m = "ABC";
            int p = Integer.parseInt(m);
        }

        catch(ArithmeticException e1){
            System.out.println("This is Arithmetical Exception.");
        }

        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("This is Array Index Out Of Bounds Exception.");
        }

        catch(NullPointerException e3){
            System.out.println("This is Null Pointer Exception.");
        }

        catch(NegativeArraySizeException e4){
            System.out.println("This is Negative Array Size Exception.");
        }

        catch(Exception e5){
            System.out.println("This is Number Format Exception.");
        }
    }
}
