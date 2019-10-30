package Session_8_solutions;

class Person {
    public String name;
    public String sex;
    private int age;

    public void talk() {
        System.out.println("Hi my name is " + name);
    }

    private void secret() {
        System.out.println("my age is " + age);
    }

}

public class PrivatePublic {

    public static void main(String[] args) {

        Person p = new Person();
        p.name = "Peter";
        p.sex = "Male";
      //  p.age = 40; doesn't work
        p.talk();
      //  p.secret(); doesn't work

    }
}
