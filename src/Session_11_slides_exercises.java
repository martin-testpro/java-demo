import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Session_11_slides_exercises {

    public static void main(String[] args) {
        // Initialize a HashSet<Integer>. Using For loop add integers from 1 to 10.
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 1; i <= 10 ; i++) {
            hs.add(i);
        }
        hs.add(1); // has no effect because 1 is already in hs.
        hs.add(1); // has no effect
        System.out.println(hs);

        // Remove all odd numbers from the HashSet.
        // (Let's copy all even elements to a new hashset)
        HashSet<Integer> newhs = new HashSet<>();
        for (int i : hs) {
            if (i %2 == 0) {
                newhs.add(i);
            }
        }
        System.out.println("even " + newhs);

        // add 100 and -100 (or some other random integers)
        hs.add(100);
        hs.add(-100);
        System.out.println("random order: " + hs);

        // Can use LinkedHashSet if you want to retain order in your set...

        System.out.println("size of hs: " + get_hs_size(hs));

        // Create an ArrayList and add some elements.
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(6);
        array.add(6);
        array.add(2);
        int num_unique = count_unique(array);
        System.out.println("ArrayList " + array + " has " + num_unique + " unique elements.");

    }

    //Create a method called get_hs_size() that returns the size of a given HashSet
    public static int get_hs_size(HashSet hs) {
        return hs.size();
    }

    // Create a method called add_element() that adds a given String to a given HashSet<String>.
    public static void add_element(HashSet<String> hash, String s) {
        hash.add(s);
    }

    // Create a method called contains_blue() that returns true if a given HashSet<String> contains “blue”.
    public static boolean contains_blue(HashSet<String> set) {
        boolean contains_blue = set.contains("blue");
        return contains_blue;
    }

    // Create a method called count_unique() that has an ArrayList<Integer> parameter and returns the
    // number of unique elements (e.g. [1,6,6,2] would return 3 because there are 3 different integers).
    public static int count_unique(ArrayList<Integer> array) {
        HashSet<Integer> temp = new HashSet<>();
        temp.addAll(array);
        return temp.size();
    }

    // Create a method called contains_1_to_10() that returns true if a HashSet<Integer> contains all the
    // the numbers from 1 to 10, and false if one or more are missing.
    public static boolean contains_1_to_10(HashSet<Integer> hs) {
        for (int i = 1; i <= 10 ; i++) {
            if (!hs.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
