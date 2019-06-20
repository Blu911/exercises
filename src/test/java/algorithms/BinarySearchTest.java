package algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void shouldReturnExpectedIndexOfSearchedNumber() {
        //given
        int[] elements = {1, 13, 4443, 67, 80, 101, 543};
        int target = 543;
        int expectedIndex = 6;
        //when
        int result = BinarySearch.binarySearch(elements, target);
        //then
        assertEquals(expectedIndex, result);
    }

}