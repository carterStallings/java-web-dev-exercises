package exercises;

public class ClassTwoArrayPractice {
    public static void main(String[] args) {
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i <someOtherInts.length; i++) {
            if (someOtherInts[i] % 2 != 0)
            System.out.print(someOtherInts[i]);
        }
    }
}
