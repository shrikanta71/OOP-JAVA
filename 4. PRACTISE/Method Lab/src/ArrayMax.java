public class ArrayMax {
    //int[] arr;
    public static int maxValue(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        //ArrayMax obj = new ArrayMax();

        int[] arr = {10, 20, 30, 15, 25};

        System.out.println(maxValue(arr));
    }
}
