package algorithms;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort() {
        int[] elementsToSort = {2, 5, 1, 4, 3};
        int[] expected = {1, 2, 3, 4, 5};

        bubbleSort.sort(elementsToSort);
        assertArrayEquals(elementsToSort, expected);
    }

    @Test
    public void testSortKobietyDoKodu() {
        int[] elementsToSort = {2, 5, 1, 4, 3};
        int[] expected = {1, 2, 3, 4, 5};

        bubbleSort.sortKobietyDoKodu(elementsToSort);
        assertArrayEquals(elementsToSort, expected);
    }
}