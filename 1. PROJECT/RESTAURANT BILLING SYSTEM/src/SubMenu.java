/* This class is for the SubMenu in the Restaurant.
 Here "Inheritance" concept is used.
 This class is "Parent/super/base" class and Menu is child class.*/

import java.util.*;

public class SubMenu {
    Scanner in = new Scanner(System.in);

//    This is DelPlato() method which referring to food that can be ordered as set meal(Platter).
    public void DelPlato() {

        System.out.println("\n1) Breakfast\n2) Lunch & Dinner\n");

        int chose = in.nextInt();

        if (chose == 1) {

            System.out.println("\n===BREAKFAST===\n");
            System.out.println("""
                    1. English Breakfast..........Tk. 320/- (BDT) [Two Eggs any style with 2 Beef or Chicken Sausages, Hash Brown Potatoes or Baked Beans, 2 Toast, Butter, jam or marmalade Coffee or Tea.]

                    2. Continental Menu..........Tk. 300/- (BDT) [Juice, Bread Basket with a selection of six breads served with butter and jam, Coffee or Tea.]

                    3. Bangladeshi Menu..........Tk. 200/- (BDT) [Parata or Chapatti served with Mixed Vegetable or Aloo Dum, 1 Egg, Sujir Halwa, Coffee or Tea.]

                    4. Cereal Menu..........Tk. 120/- (BDT) [Cold cereal with Milk.]

                    5. French Toast Menu..........Tk. 150/- (BDT) [4 French Toast served with onion and tomato or syrup.]""");

            System.out.println("\n\n===ADD ONS===\n");
            System.out.println("""
                    101. Two Fresh Eggs any style..........Tk. 70/- (BDT)
                    102. Sausage..........Tk. 65/- (BDT)
                    103. French Fries..........Tk. 50/- (BDT)
                    104. Toast- 2 Slices..........Tk. 40/- (BDT)
                    105. Parata- 2 Pcs..........Tk. 60/- (BDT)
                    106. Chapatti- 2 pcs..........Tk. 40/- (BDT)
                    107. Bhaji..........Tk. 50/- (BDT)
                    108. Aloo dum..........Tk. 50/- (BDT)
                    109. Sujir Halwa..........Tk. 50/- (BDT)
                    110. Bread Basket- 6 Rolls of Bread..........Tk. 125/- (BDT)

                    201. Variety of Juice..........Tk. 75/- (BDT)
                    202. Coffee..........Tk. 30/- (BDT)
                    203. Tea..........Tk. 20/- (BDT)
                    204. Hot Chocolate..........Tk. 50/- (BDT)
                    205. Milk..........Tk. 50/- (BDT)""");
        } else if (chose == 2) {

            System.out.println("\n===LUNCH & DINNER===\n");
            System.out.println("""
                    1001. Ghorer Khabar..........Tk. 425/- (BDT) [Fine Quality Steamed Rice (Katari bhog/Nazirshal), served with Thick Daal, Mixed Vegetable Bhaji and choice of Chicken (Local) or Beef Bhuna.]

                    1002. Bhorta Bahar..........Tk. 400/- (BDT) [Fine Quality Steamed Rice (Katari bhog/Nazirshal), served with Thick Daal and your choice of five Bhrota. Choose any five-Begun Bhorta, Aloo Bhorta, Daal Bhorta, Egg Bhorta, Chingri Bhorta, Shutki Bhorta, Mach Bhorta, Sheem Bhorta, Barbati Bhorta, Patal Bhorta, Tomato Bhorta.]

                    1003. Mach a Bhat a..........Tk. 400/- (BDT) [Fine Quality Steamed Rice (Katari bhog/Nazirshal), served with Thick Daal, Mixed Vegetable Bhaji and choice of Rui/Katal/ Illish Bhaji or Bhuna.]

                    1004. Luchi Kabab..........Tk. 450/- (BDT) [Luchi/Parata, Aloo Dum/ Daal Bhuna, served with Special Haadi Kabab and Onion Salad. This Delicios meal also includes Gajorer/Sujir Halwa.]

                    1005. Khichuri Khazana..........Tk. 625/- (BDT) [Moog Daal er Bhuna Khichuri, Served with Begun Bhaja( Fried Brinjal), Mach Bhaja (Fish Fry), Egg Masala Omlette /Egg Bhuna and choice of Chicken (Local) or Beef Bhuna. This Menu comes with Salad, Caramal Pudding/ Roshogolla and Tea/Coffee.]

                    1006. Pulao Korma/Roast..........Tk. 600/- (BDT) [Best Quality Kalijeera Rice Pulao served with Chicken Korma / Roast, Rui Bhaja, Mixed Vegetable.This Menu comes with Salad, Caramal Pudding/ Roshogolla and Tea/Coffee.]

                    1007. Pulao Gosht..........Tk. 600/- (BDT) [Best Quality Kalijeera Rice Pulao served with Beef Bhuna / Jhal Gosht , Rui Bhaja, Mixed Vegetable.This Menu comes with Salad, Caramal Pudding/ Roshogolla and Tea/Coffee.]

                    1008. Morogh Pulao..........Tk. 600/- (BDT) [Best Quality Kalijeera Rice Pulao cooked with local chicken served with Shammi Kabab Mixed Vegetable.This Menu comes with Salad, Caramal Pudding/ Roshogolla and Tea/Coffee.]

                    1009. Beef Tehari..........Tk. 600/- (BDT) [Best Quality Kalijeera Rice Beef Tehari served with Aloo Keema Chop, Mixed Vegetable. This Menu comes with Salad, Caramal Pudding/ Roshogolla and Tea/Coffee.]

                    1010. Pulao Mutton Rezala..........Tk. 750/- (BDT) [Best Quality Kalijeera Rice Pulao served with Mutton Rezala, Shammi Kabab, Mixed Vegetable.This Menu comes with Salad, Caramal Pudding/ Roshogolla and Tea/Coffee.]

                    1011. Kids Menu..........Tk. 350/- (BDT) [Kid’s portion of Plain Pulao, chicken korma, Beef Chop served with French Fries. This Menu comes with vanilla ice cream.]

                    1012. BBQ Night..........Tk. 750/- (BDT) [Luchi/Parata, Butter Chicken served with BBQ Chichen Tandoori/Beef Shikh Kababa fresh from barbeque. This menu comes with salad, Firni /Gurer Payesh and your choice of Canned Beverage.]""");

            System.out.println("\n\n===ADD ONS===\n");
            System.out.println("""
                    2001. Chapati..........Tk. 25/- (BDT)
                    2002. Shami Kabab..........Tk. 60/- (BDT)
                    2003. Aloor Chop..........Tk. 50/- (BDT)
                    2004. Chicken bhuna..........Tk. 125/- (BDT)
                    2005. Beef bhuna..........Tk. 125/- (BDT)
                    2006. Egg Curry..........Tk. 55/- (BDT)
                    2007. Egg Daal Curry..........Tk. 70/- (BDT)
                    2008. Shutki..........Tk. 55/- (BDT)
                    2009. Balachao..........Tk. 50/- (BDT)
                    2010. Mixed Pickle..........Tk. 50/- (BDT)
                    2011. Chutney of the season..........Tk. 50/- (BDT)
                    2012. Onion, lemon and cucumber platter..........Tk. 50/- (BDT)

                    3001. Tea..........Tk. 20/- (BDT)
                    3002. Coffee..........Tk. 30/- (BDT)
                    3003. Soft Drinks – Litre Bottle..........Tk. 120/- (BDT)
                    3004. Soft Drinks – 250 ml can..........Tk. 45/- (BDT)""");
        } else {
            System.out.println("Invalid Input");
        }

    }

//    This is ALaCarte() method which referring to food that can be ordered as separate items, rather than part of a set meal.
    public void ALaCarte() {

        System.out.println("\n===BREAKFAST===\n");
        System.out.println("""
                101. Two Fresh Eggs any style..........Tk. 70/- (BDT)
                102. Sausage..........Tk. 65/- (BDT)
                103. French Fries..........Tk. 50/- (BDT)
                104. Toast- 2 Slices..........Tk. 40/- (BDT)
                105. Parata- 2 Pcs..........Tk. 60/- (BDT)
                106. Chapatti- 2 pcs..........Tk. 40/- (BDT)
                107. Bhaji..........Tk. 50/- (BDT)
                108. Aloo dum..........Tk. 50/- (BDT)
                109. Sujir Halwa..........Tk. 50/- (BDT)
                110. Bread Basket- 6 Rolls of Bread..........Tk. 125/- (BDT)

                201. Variety of Juice..........Tk. 75/- (BDT)
                202. Coffee..........Tk. 30/- (BDT)
                203. Tea..........Tk. 20/- (BDT)
                204. Hot Chocolate..........Tk. 50/- (BDT)
                205. Milk..........Tk. 50/- (BDT)""");

        System.out.println("\n\n===SNACKS AND QUICK BITES (SERVED WITH TOMATO KETCHUP/CHUTNEY)===\n");
        System.out.println("""
                501. Kids Special Noodles..........Tk. 50/- (BDT)
                502. Beef Samosa 2 Pcs..........Tk. 40/- (BDT)
                503. Spring roll 2 Pcs..........Tk. 50/- (BDT)
                504. Butterfly Prawn 4 Pcs with dip..........Tk. 75/- (BDT)
                505. Vegetable Singara 2 Pcs..........Tk. 60/- (BDT)
                506. Kabab Roll with choice of beef or chicken..........Tk. 75/- (BDT)
                507. Chicken Nugget 6 Pcs..........Tk. 150/- (BDT)
                508. Chen Kiev 6 Pcs..........Tk. 150/- (BDT)
                509. Fish Finger 6 Pcs..........Tk. 150/- (BDT)
                510. French Fries..........Tk. 50/- (BDT)
                511. Chicken Cutlet 2 Pcs..........Tk. 100/- (BDT)
                512. Beef Cutlet 2 Pcs..........Tk. 100/- (BDT)
                513. Prawn on Toast 2 Pcs..........Tk. 100/- (BDT)
                514. Mini Chicken Shashlic 2 Pcs..........Tk. 100/- (BDT)
                515. Jhal muri / Chanachur 3 Persons..........Tk. 100/- (BDT)
                516. French Toast 2 Pcs..........Tk. 80/- (BDT)
                517. Keema Chop 2 Pcs..........Tk. 60/- (BDT)
                518. Shammi Kabab 2 Pcs..........Tk. 100/- (BDT)
                519. Pantarash 2 Pcs..........Tk. 100/- (BDT)
                520. Fish Finger- served with French Fries and Mayonnaise..........Tk. 120/- (BDT)
                521. Bhaja Pora- vegetable pakora /beguni /peyaju 16 Pcs..........Tk. 160/- (BDT)
                522. Cheese Singara Platter 10 Pcs..........Tk. 120/- (BDT)""");

        System.out.println("\n\n===DINNER & LUNCH===\n");
        System.out.println("""
                601. BBQ Chicken 1 Pc..........Tk. 125/- (BDT)
                602. Beef Sheek Kabab 1 Pc..........Tk. 150/- (BDT)
                603. Bangladeshi Delicacies(Serves 3 /4 Persons)
                604. Chicken Bhuna..........Tk. 500/- (BDT)
                605. Chicken Korma..........Tk. 500/- (BDT)
                606. Chicken Do Piaza..........Tk. 500/- (BDT)
                607. Chicken Rezala..........Tk. 500/- (BDT)
                608. Butter Chicken..........Tk. 500/- (BDT)
                609. Shorshe Chicken..........Tk. 500/- (BDT)
                610. Chicken Jhal Frazee..........Tk. 500/- (BDT)
                611. Beef Curry..........Tk. 525/- (BDT)
                612. Beef Bhuna..........Tk. 525/- (BDT)
                613. Beef Rezala..........Tk. 525/- (BDT)
                614. Beef Korma..........Tk. 525/- (BDT)
                615. Beef Do Piaza..........Tk. 525/- (BDT)
                616. Handi Kabab..........Tk. 525/- (BDT)
                617. Acchar Beef..........Tk. 525/- (BDT)
                618. Shammi Kabab 4 Pcs..........Tk. 200/- (BDT)
                619. Beef Jalli Kabab 4 pcs..........Tk. 200/- (BDT)
                620. Mutton Rezala..........Tk. 600/- (BDT)
                621. Fish Curry 4pcs..........Tk. 450/- (BDT)
                622. Fish Do Piaza..........Tk. 450/- (BDT)
                623. Fish Jhol Torkari..........Tk. 450/- (BDT)
                624. Fish Bhuna..........Tk. 450/- (BDT)
                625. Prawn Do piazza..........Tk. 675/- (BDT)
                626. Chingri Macher Malaikari..........Tk. 675/- (BDT)
                627. Prawn Bhuna..........Tk. 675/- (BDT)
                628. Bhorta (Choose any – Begun Bhorta, Alu Bhorta, Daal Bhorta, Egg Bhorta, Chingri Bhorta, Shutki Bhorta, Mach Bhorta, Sheem Bhorta, Barbati Bhorta, Patal Bhorta, Tomato Bhorta)..........Tk. 150/- (BDT)
                629. Mixed Vegetable..........Tk. 150/- (BDT)
                630. Seasonal Vegetable Curry..........Tk. 150/- (BDT)
                631. Chinese Style Vegetable..........Tk. 150/- (BDT)
                632. Daal..........Tk. 150/- (BDT)
                633. Daal Chorchori..........Tk. 150/- (BDT)
                634. Seasonal Salad..........Tk. 150/- (BDT)
                635. Rice One Person..........Tk. 60/- (BDT)""");

        System.out.println("\n\n===DESSERT===\n");
        System.out.println("""
                701. Firni..........Tk. 50/- (BDT)
                702. Gurer Payesh..........Tk. 60/- (BDT)
                703. Brownie..........Tk. 85/- (BDT)
                704. Caramel Pudding (serves 6)..........Tk. 450/- (BDT)
                705. Caramel Pudding (serves 12)..........Tk. 875/- (BDT)""");

        System.out.println("\n\n===BEVERAGE===\n");
        System.out.println("""
                751. Tea..........Tk. 20/- (BDT)
                752. Coffee..........Tk. 30/- (BDT)
                753. Soft Drinks – Litre Bottle..........Tk. 120/- (BDT)
                754. Soft Drinks – 250 ml can..........Tk. 45/- (BDT)
                755. Bottled Mineral Water..........Tk. 40/- (BDT)""");

        System.out.println("\n\n===SANDWICH (SERVED WITH POTATO CHIPS)===\n");
        System.out.println("651. Homemade Chicken Sandwich 2 pcs..........Tk. 80/- (BDT)\n" +
                "652. Club Sandwich with Chicken & Vegetable..........Tk. 200/- (BDT)");

        System.out.println("\n\n===PIZZAS===\n");
        System.out.println("""
                551. Chef’s special Beef Pizza..........Tk. 525/- (BDT)
                552. Chef’s Special Chicken Pizza..........Tk. 525/- (BDT)
                553. Chef’s Special Shrimp Pizza..........Tk. 525/- (BDT)""");

        System.out.println("\n\n===PASTA===\n");
        System.out.println("801. Special Chicken Pasta..........Tk. 395/- (BDT)\n" +
                "802. Special Beef pasta..........Tk. 450/- (BDT)");

        System.out.println("\n\n===SOUPS===\n");
        System.out.println("""
                851. Chicken Corn Soup..........Tk. 85/- (BDT)
                852. Thai Soup..........Tk. 100/- (BDT)
                853. Chicken/ Beef Noodle Soup..........Tk. 50/- (BDT)""");

        System.out.println("\n\n===SALADS===\n");
        System.out.println("""
                901. Chef’s Special Vegetable Salad..........Tk. 50/- (BDT)
                902. Raita- Cucumber Salad..........Tk. 50/- (BDT)
                903. Caesar Salad..........Tk. 55/- (BDT)""");
    }
}
