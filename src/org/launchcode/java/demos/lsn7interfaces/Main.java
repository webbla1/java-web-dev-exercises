package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the size of 'allergens'
        //  field.
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Use a Comparator class to sort the 'toppings' array in increasing order by the 'name'
        //  field.
        toppings.sort(new ToppingComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " contains " + flavor.getAllergens().size() + " allergens");
        }
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getCost());
        }

    }
}
