package Session_10_solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyCollections {


    public static void main(String[] args) {


        ArrayList<Integer> first_ten = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            first_ten.add(i);
        }
        System.out.println(first_ten);


        ArrayList<Integer> random = new ArrayList<>();
        random.add(2);
        random.add(2);
        random.add(3);
        random.add(6);
        random.add(7);
        random.add(3);
        random.add(2);
        random.add(1);

        System.out.println("\nbefore removing 2 and odd numbers");
        System.out.println(random);
        for (int i = random.size()-1; i >=0 ; i--) {
            int element = random.get(i);
            if (element == 2 || element %2 == 1) {
                random.remove(i);
            }
        }
        System.out.println("after:");
        System.out.println(random);

        /*
        for the rest of the exercises please see the solutions and nice explanations at
        https://www.w3resource.com/java-exercises/collection/index.php
         */


    }

}
