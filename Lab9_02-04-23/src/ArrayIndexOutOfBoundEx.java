public class ArrayIndexOutOfBoundEx {

    public static void main(String[] args) {

        try{
            int[] a = new int[5];
            System.out.println(a[6]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is Array Index Out Of Bounds Exception.");
        }
    }
}
