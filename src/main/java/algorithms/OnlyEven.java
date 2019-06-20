package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OnlyEven {

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
