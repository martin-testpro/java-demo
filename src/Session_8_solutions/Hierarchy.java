package Session_8_solutions;


class Animal {
    // defining a special toString method like this allows you to print a
    // string (that the method you define returns) when
    // you print an object created from this class.
    public String toString() {
        return "an animal";
    }
}

class Mammal extends Animal {
    // Mammal inherits the toString method from Animal, but
    // here we are "overriding" the method (redefining it to be something
    // else for Mammals).
    public String toString() {
        return "a mammal";
    }
}

class Dog extends Mammal {
    // Dog inherits the toString from Mammal but we override it again.
    public String toString() {
        return "a dog";
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println(a);
        System.out.println(m);
        System.out.println(d);
    }
}
