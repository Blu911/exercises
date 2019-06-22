package algorithms.practicetasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PavementTest {

    @Test
    public void shouldReturnExpectedMissingNumber() {
        //given
        int n = 5;
        int[] l = {1, 2, 3, 5};
        int expectedNumber = 4;
        //when
        int result = Pavement.solution(n, l);
        //then
        assertEquals(expectedNumber, result);
    }
}