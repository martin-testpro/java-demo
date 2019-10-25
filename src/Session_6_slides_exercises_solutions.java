public class Session_6_slides_exercises_solutions {

    public static void main(String[] args) {

        try {
            int an_integer = 1/0; // this results in a runtime error
        } catch (Exception e) {
            System.out.println("tried to divide by 0");
        }

        try {
            String test_string = "abcde";
            test_string.charAt(100);
        } catch (Exception e) {
            System.out.println("Something didn't work");
        }

        try {
            a_method();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            b_method("loooong string");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            c_method(333,2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            d_method(true);
        } catch (Exception e) {
            System.out.println("Print out something");
        }


    }

    public static void a_method() throws Exception {
        throw new Exception("I am throwing an exception!");
    }

    public static void b_method(String s) throws Exception{
        if (s.length() > 10) {
            throw new Exception("string is too long");
        }
    }

    public static void c_method(int a, int b) throws Exception {
        if (a+b > 100) {
            throw new Exception("sum can't be greater than 100");
        }
    }

    public static void d_method(boolean b) throws Exception {
        if (b) {
            throw new Exception();
        }
    }

}
