package algorithms;

public class BinarySearch {

    static int binarySearch(int[] elements, int target) {
        int length = elements.length;

        int max = length - 1;
        int min = 0;
        int middle;

        while (max >= min) {
            middle = (max + min) / 2;

            if (elements[middle] == target) {
                return middle;
            }

            if (elements[middle] > target) {
                max = middle - 1;
            }

            if (elements[middle] < target) {
                min = middle + 1;
            }
        }
        return -1;
    }
}
