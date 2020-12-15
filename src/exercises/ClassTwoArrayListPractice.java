package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassTwoArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
            grades.add(2);
            grades.add(3);
            grades.add(4);
            grades.add(10);
            grades.add(7);
            grades.add(17);

        double sum = 0;
        for (Integer i : grades) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        ArrayList<String> words = new ArrayList<>();
            words.add("hello");
            words.add("carter");
            words.add("horse");
            words.add("java");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length:");
        Double wordLength = input.nextDouble();

        for (String i : words) {
            if (i.length() == wordLength) {
                System.out.println(i);
            }
        }
    }
}
