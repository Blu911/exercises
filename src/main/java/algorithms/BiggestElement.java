package algorithms;

public class BiggestElement {

    static int findBiggestElement(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int findBiggestElementIndex(int[] array) {
        int index = 0;
        int max = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
