package Session_8_solutions;

class Car {
    public void accessible() {
        System.out.println("accessible information about a car");
    }
    private void not_accessible() {
        System.out.println("only accessible if called from another method within the class");
    }

    public void bypass() {
        not_accessible();
    }
}

class Mercedes extends Car {
    public String model;
}

class Toyota extends Car {
    public String model;
}

class LandRover extends Car {
    public String model;
}

public class CarExercise {

    public static void main(String[] args) {

        Car c = new Car();
        c.accessible();
       // c.not_accessible();   can't do this
        c.bypass();

        System.out.println("\n\nfrom the mercedes object:");
        Mercedes m = new Mercedes();
        m.model = "ABC";
        m.accessible();

        Toyota t = new Toyota();
        t.model = "Corolla";

        LandRover lr = new LandRover();
        lr.model = "range rover";

        // since toyotas, landrovers, and mercedes are all Cars
        // we can put them in a Cars array
        Car[] array = {m, t, lr};

    }

}
