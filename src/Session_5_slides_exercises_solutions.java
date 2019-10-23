import java.util.Arrays;

public class Session_5_slides_exercises_solutions {

    public static void main(String[] args) {

        // create an array of integers {1,2,3,4}
        int[] int_array = {1,2,3,4};
        System.out.println("first integer: " + int_array[0]);
        System.out.println("length: " + int_array.length);
        System.out.println("last integer: " + int_array[int_array.length-1]);
        // for each loop
        for (int temp : int_array) {
            System.out.println(temp);
        }
   /*     // for loop
        for (int i = 0; i < int_array.length; i++) {
            System.out.println(int_array[i]);
        }
        //while loop
        int index = 0;
        while (index < int_array.length) {
            System.out.println(int_array[index]);
            index++;
        }*/



        System.out.println(); // print out an empty line

        // create an array of Strings {"red", "green", "blue", "white", "pink"}
        String[] colors = {"red", "green", "blue", "white", "pink"};
        System.out.println(colors.length);
        System.out.println(Arrays.toString(colors));
        colors[1] = "black";
        System.out.println(Arrays.toString(colors));
        colors[4] = "red";
        System.out.println(Arrays.toString(colors));

        System.out.println();

        // create an array of 1000 zeros. change the value at index 42 to 42.
        int[] zeros = new int[1000];
        zeros[42] = 42;
        System.out.println(Arrays.toString(zeros));

        // create the array {0,1,2,3,4...999}
        // let us just modify the one we just created
        for (int i = 0; i < zeros.length; i++) {
            zeros[i] = i;
        }
        System.out.println(Arrays.toString(zeros));

        System.out.println();

        // create an array of Strings, then create an array of integers that holds the lengths of the Strings
        String[] my_strings = {"hello", "apples", "1111111", "cats are cool", "bananas.docx"};
        int[] string_lengths = new int[my_strings.length]; // create an array of zeros of the right size
        for (int i = 0; i < my_strings.length; i++) {
            string_lengths[i] = my_strings[i].length();
        }
        System.out.println(Arrays.toString(my_strings));
        String to_print = Arrays.toString(string_lengths);
        System.out.println("the lengths of the strings are: " + to_print);

    }
}
