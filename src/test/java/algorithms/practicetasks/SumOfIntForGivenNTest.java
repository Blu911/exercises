package algorithms.practicetasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfIntForGivenNTest {

    @Test
    public void solution01ShouldReturnExpectedValue() {
        //given
        int n = 3;
        int expectedSumOfIntegersForGivenN = 6;
        //when
        int result = SumOfIntForGivenN.solutionOn(n);
        //then
        assertEquals(expectedSumOfIntegersForGivenN, result);
    }

    @Test
    public void solutionOnShouldReturnExpectedValue() {
        //given
        int n = 4;
        int expectedSumOfIntegersForGivenN = 10;
        //when
        int result = SumOfIntForGivenN.solutionO1(n);
        //then
        assertEquals(expectedSumOfIntegersForGivenN, result);
    }

    @Test
    public void solutionOn2ShouldReturnExpectedValue() {
        //given
        int n = 5;
        int expectedSumOfIntegersForGivenN = 15;
        //when
        int result = SumOfIntForGivenN.solutionOn2(n);
        //then
        assertEquals(expectedSumOfIntegersForGivenN, result);
    }
}