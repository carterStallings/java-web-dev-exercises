package exercises;

import java.util.Arrays;

public class ClassTwoArrayPractice {
    public static void main(String[] args) {
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i <someOtherInts.length; i++) {
            if (someOtherInts[i] % 2 != 0)
            System.out.print(someOtherInts[i]);
        }

        String stringOne = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] words = stringOne.split(" ");
        System.out.print('\n' + Arrays.toString(words));

        String stringTwo = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] wordsTwo = stringOne.split("\\.");
        System.out.print('\n' + Arrays.toString(wordsTwo));
    }
}
