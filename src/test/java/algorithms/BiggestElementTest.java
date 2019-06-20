package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggestElementTest {

    @Test
    public void shouldReturnExpectedElement() {
        //given
        int[] elements = {1, 13, 4443, 67, 80, 101, 543};
        int expectedElement = 4443;
        //when
        int result = BiggestElement.findBiggestElement(elements);
        //then
        assertEquals(expectedElement, result);
    }

    @Test
    public void shouldReturnExpectedElementIndex(){
        //given
        int[] elements = {1, 13, 4443, 67, 80, 101, 543};
        int expectedIndex = 2;
        //when
        int result = BiggestElement.findBiggestElementIndex(elements);
        //then
        assertEquals(expectedIndex, result);
    }
}