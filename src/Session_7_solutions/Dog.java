package Session_7_solutions;

public class Dog {

    // attributes----------------------------
    int age;
    String name;

    // methods-----------------------------
    // constructor method
    public Dog(String dog_name, int dog_age) {
        age = dog_age;
        name = dog_name;
    }

    public void bark() {
        System.out.println("woof woof");
    }

    public void getting_older() {
        age++;
    }

    public String toString() {
        return "A dog witih name " + name + " and age " + age;
    }


}
