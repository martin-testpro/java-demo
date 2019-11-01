package Session_9_solutions;

//https://www.geeksforgeeks.org/interfaces-in-java/
interface Vehicle {
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    public int speed=0;
    public int gear=0;

    // to change gear
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    public void speedUp(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle {
    public int speed=0;
    public int gear=0;
    // to change gear
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

public class Vehicles {

    public static void main(String[] args) {

        Bike b = new Bike();
        System.out.println("original speed " + b.speed);
        b.speedUp(11);
        System.out.println("new speed " + b.speed);

    }
}
