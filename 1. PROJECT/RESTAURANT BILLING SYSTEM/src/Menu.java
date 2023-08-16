/* This class is for the Menu in the Restaurant.
 Here "Inheritance" concept is used.
 This class is "child/sub/derived" class and SubMenu is parent class.*/

import java.util.*;

public class Menu extends SubMenu {
    Scanner in = new Scanner(System.in);

    public Menu() {

        System.out.println("\n1) Del Plato\n2) A La Carte\n");
//       Del Plato -  (in a restaurant) referring to food that can be ordered as set meal(Platter).
//       A La Carte - (in a restaurant) referring to food that can be ordered as separate items, rather than part of a set meal.

        int chose = in.nextInt();
        if (chose == 1) {
            super.DelPlato(); // Calling the parent class method by using 'super' keyword.
        } else if (chose == 2) {
            super.ALaCarte(); // Calling the parent class method by using 'super' keyword.
        }
    }
}
