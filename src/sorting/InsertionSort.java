package sorting;

import java.util.Arrays;

public class InsertionSort {
    static int[] array = {5, 2, 4, 6, 1, 3};

    public static void main(String[] args) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int t = array[j];
                array[j] = array[j - 1];
                array[j - 1] = t;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
