package exercises;

import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the number of miles you have driven:");
        Double miles = input.nextDouble();
        System.out.println("Hello, please enter the amount of gas you have consumed (in gallons:");
        Double gallons = input.nextDouble();
        input.close();
        Double mpg = miles/gallons;
        System.out.println("Hello, your mpg is " + mpg + "mpg ");

    }
}
