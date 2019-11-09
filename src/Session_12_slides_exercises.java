import java.util.HashMap;

public class Session_12_slides_exercises {


    public static void main(String[] args) {

        // Create a HashMap<String, Integer>. Add (put) Jane:25 and Jane:30 as key/value. What
        // is the size of the HashMap?
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Jane", 25);
        // note that the second 'put' overwrites the first
        people.put("Jane", 30);
        System.out.println(people);
        System.out.println("size is " + people.size());


        //Create a HashMap<Integer,String> with 1:a, 2:aa, 3:aaa, 4:aaaa,... 100:aaa….aaa.
        HashMap<Integer, String> lots_of_a = new HashMap<>();
        String string_of_a = "a";
        for (int i = 1; i <= 100 ; i++) {
            lots_of_a.put(i, string_of_a);
            string_of_a += "a";
        }
        System.out.println(lots_of_a);



    }
}
