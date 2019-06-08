package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

    static int[] onlyEvenAndNoRepetition(int[] array) {
        HashSet<Integer> temporary = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                temporary.add(array[i]);
            }
        }
        int[] result = new int[temporary.size()];
        int count = 0;
        for(Integer element : temporary) {
            result[count] = element;
            count++;
        }
        return result;
    }

    static int[] onlyEvenAndUnique(int[] array) {
        List<Integer> list = new ArrayList<>();

        Arrays.stream(array).distinct().filter(x -> x % 2 == 0).sorted().forEach(list::add);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
