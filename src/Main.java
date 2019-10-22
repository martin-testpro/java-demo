
public class Main {
    public static void main(String[] args) {

        // add all the numbers from 1 to 1000.
        // i.e. add 1+2+3+4...+1000 and print the result.
        int sum = 0;
        int to_add = 1;
        while (to_add <= 100) {
            sum = sum + to_add;
            to_add++;
        }
        System.out.println("sum of 1 to 1000 is: " + sum);



        // print out the numbers from 1 to 10 using a while loop
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i = i + 1;

        }

        // print out numbers from 1 to 10 using for loop
        for (int j = 1; j <= 10 ; j++) {
            System.out.println(j);
        }

        // print out the string "aaaa..aaa" with 150 a's, while loop
        String a= "";
        int k = 0;
        while (k <150) {
            a = a + "a";
            k++;
        }
        System.out.println(a);

        // print out "aaa...aaa" with a for loop
        String aa = "";
        for (int j = 0; j < 150; j++) {
            aa += "a";
        }
        System.out.println(aa);

        // print numbers from 10 down to 1
        for (int j = 10; j > 0 ; j = j - 1) {
            System.out.println(j);

        }

        // write a program to print the first n terms of the fibonacci sequence
        // the fibonacci sequence starts with 0, 1. subsequent terms are the sum of the previous two
        // i.e. 0 + 1 = 1, so 1 is the third term. then it's 1+1 = 2....
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm;
        int number = 20;
        System.out.print(firstTerm + " " + secondTerm + " ");
        for(int c = 3; c <= number; c++) {
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        System.out.println("\n");


        // given a number n, print out if it is prime or not
        int n = 102;
        boolean prime = true;
        for (int m = 2; m < n; m++) {
            if (n % m == 0) {
                prime = false;
                break;
            }
        }
        if (n > 2  && prime) {
            System.out.println(n + " is prime!");
        } else {
            System.out.println(n + " is not prime!");
        }


        // calculate the series 1/1 + 1/2 + 1/3 + ... + 1/num
        double total = 0;
        int num = 2;
        for(int p = 1; p <= num; p++) {
            total += 1.0/i;
        }
        System.out.println("sum: " + total);

    }

}

