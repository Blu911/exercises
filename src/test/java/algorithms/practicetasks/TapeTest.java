package algorithms.practicetasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeTest {

    @Test
    public void shouldReturnExpectedDifferenceValueBetweenTwoSums(){
        //given
        int n = 5;
        int[] a = {3, 1, 2, 4, 3};
        int expectedValue = 1;
        //when
        int result = Tape.solution(n, a);
        //then
        assertEquals(expectedValue,result);
    }
}