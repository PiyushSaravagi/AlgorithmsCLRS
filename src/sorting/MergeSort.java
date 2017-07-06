package sorting;

import java.util.Arrays;

public class MergeSort {
    static int[] array = {38, 27, 43, 3, 9, 82, 10};

    private static void mergeSort(int p, int r) {
        int q = (p + r) / 2;
        if (r - p > 1) {
            mergeSort(p, q);
            mergeSort(q + 1, r);
        }
        combine(p, r);
    }

    private static void combine(int p, int r) {
        int q = (p + r) / 2;

        int ptr1 = p;
        int ptr2 = q + 1;
        int[] temp_array = new int[r - p + 1];
        for (int i = 0; i <= r - p; i++) {
            if (ptr1 > q) {
                temp_array[i] = array[ptr2];
                ptr2++;
            } else if (ptr2 > r) {
                temp_array[i] = array[ptr1];
                ptr1++;
            } else if (array[ptr1] < array[ptr2]) {
                temp_array[i] = array[ptr1++];
            } else {
                temp_array[i] = array[ptr2++];
            }
        }

        for (int i = 0; i <= r - p; i++) {
            array[i + p] = temp_array[i];
        }
    }


    public static void main(String[] args) {
        mergeSort(0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}