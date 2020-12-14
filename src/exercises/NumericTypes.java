package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the length of the rectangle:");
        Double length = input.nextDouble();
        System.out.println("Hello, please enter the width of the rectangle:");
        Double width = input.nextDouble();
        input.close();
        Double area = length * width;
        System.out.println("Hello, the area of the rectangle is " + area);

    }
}
