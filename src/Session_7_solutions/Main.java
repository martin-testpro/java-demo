package Session_7_solutions;

public class Main {

    public static void main(String[] args) {

        // working with the Dog class
        Dog d1 = new Dog("Spot", 3);
        Dog d2 = new Dog("Freddy", 11);
        System.out.println(d1);
        System.out.println("the age of our dog is " +d1.age);
        d1.getting_older();
        System.out.println("after ageing: " + d1.age);
        // array of dogs
        Dog[] array = {d1, d2};
        for (Dog d : array) {
            System.out.println(d);
        }

        // working with the Simple class
        Simple s = new Simple();
        System.out.println("\nprinting out the attribute: " + s.x);

        System.out.println(); // empty line
        // calling a static method can be done without creating an object
        ClassThatHasOneStaticMethod.static_method();

        // A class with a constructor to set one attribute
        SomewhatLessSimple ex = new SomewhatLessSimple(42);
        System.out.println("\nThe attribute is: " + ex.x);

        // squares
        Square s1 = new Square("green", 2);
        Square s2 = new Square("blue",3);
        Square s3 = new Square("black", 55);
        System.out.println("\nperimeter is " + s1.get_perimeter());

        // button
        System.out.println();
        Button b = new Button("login");
        b.click();
    }
}
