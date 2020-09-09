/*
Author Brandon Tennyson
Cosc 237
Program 1
9:30 tues wednesday 
Description: this program takes in multible double and int values and then 
multuiplies them all together and provides an output while error checking
all of the values.
 */
package drakeequation;

import java.util.Scanner;

public class DrakeEquation {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //declare variables
        int r = 0;
        double p = 0;
        double n = 0;
        double f = 0;
        double i = 0;
        double c = 0;
        int l = 0;

        //prompt user to enter values with indications for all
        do {

            System.out.println("Enter the value for"
                    + " the rate of star creation");
            while (!in.hasNextInt() || r < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            r = in.nextInt();
        } while (r < 0);

        do {
            System.out.println("Enter the percentage"
                    + " of stars with planets");
            while (!in.hasNextDouble() || p < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            p = in.nextDouble();
        } while (p < 0);

        do {
            System.out.println("Enter the value for "
                    + "average number of planets that "
                    + "can probably suport life for each"
                    + " star with planets");
            while (!in.hasNextDouble() || n < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            n = in.nextDouble();
        } while (n < 0);

        do {
            System.out.println("Enter the percentage of"
                    + " those that go on to develop life");
            while (!in.hasNextDouble() || f < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            f = in.nextDouble();
        } while (f < 0);

        do {
            System.out.println("Enter the percentage of"
                    + " those who go on to intlligent develop life");
            while (!in.hasNextDouble() || i < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            i = in.nextDouble();

        } while (i < 0);

        do {
            System.out.println("Enter the percentage of"
                    + " those willing and able to communicate");
            while (!in.hasNextDouble() || c < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            c = in.nextDouble();

        } while (c < 0);

        do {
            System.out.println("Enter the value for "
                    + "expected lifetime of civilizations");
            while (!in.hasNextInt() || l < 0) {
                in.next();
                System.out.println("That is not a valid input");
            }
            l = in.nextInt();
        } while (l < 0);

        //let the user know what values they had just entered
        System.out.println("the values you entered are:\n"
                + "r = " + r + "\np = " + p + "%\nn = "
                + n + "\nf = " + f + "%\ni = " + i + "%\nc = "
                + c + "%\nl = " + l);
        //since there are percent values, devide those values by 100
        p = p / 100;
        f = f / 100;
        i = i / 100;
        c = c / 100;
        //calculate N and then display
        System.out.println("therefore N would be the multiple of all of these values.");
        double N = 0;
        N = r * p * n * f * i * c * l;
        System.out.println("N is: " + N);

    }

}