import java.util.*;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Shrikanta");
        numbers.add("Nurol");
        numbers.add("Hira");
        numbers.add("Shrabon");
        numbers.add("Anik");

        System.out.println("Unsorted ArrayList: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }
}
