package sorting;

import java.util.Arrays;

public class SelectionSort {
    static int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

    public static void main(String[] args){
        for (int i = 0; i < array.length; i++) {
            int min_pos = i;
            for (int j = i + 1; j < array.length; j++) {
                min_pos = array[j] < array[min_pos] ? j : min_pos;
            }
            int t = array[i];
            array[i] = array[min_pos];
            array[min_pos] = t;
            System.out.println(Arrays.toString(array));
        }
    }
}
