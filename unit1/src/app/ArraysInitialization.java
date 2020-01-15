package app;

public class ArraysInitialization {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        boolean[] values = new boolean[8];
        for (boolean value : values)
        {
            System.out.println(value);
        }
    }
}