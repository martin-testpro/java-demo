package Session_9_solutions;

interface Bank {
    void rateOfInterest();
}

class Chase implements Bank {

    public void rateOfInterest() {
        System.out.println("4%");
    }
}


class BofA implements Bank {

    public void rateOfInterest() {
        System.out.println("5%");
    }
}



public class Banks {

    public static void main(String[] args) {

        Bank b = new Chase();
        Bank b2 = new BofA();
        b.rateOfInterest();
        b2.rateOfInterest();



    }
}


