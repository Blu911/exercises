package algorithms;

import java.util.ArrayList;
import java.util.List;

class QuickSort {

    static List<Integer> quickSort(List<Integer> list) {
        if(list.size() <=1) {
            return list;
        }
        List<Integer> result = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> smaller = new ArrayList<>();
        Integer pivot = list.remove(list.size() / 2);
        for (Integer element : list) {
            if (pivot > element) {
                smaller.add(element);
            } else {
                bigger.add(element);
            }
        }
        smaller = quickSort(smaller);
        bigger = quickSort(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);
        return result;
    }
}
