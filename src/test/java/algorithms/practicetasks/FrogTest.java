package algorithms.practicetasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogTest {

    @Test
    public void shouldReturnExpectedNumberOfFrogJumps() {
        //given
        int x = 1;
        int y = 85;
        int s = 30;
        int expectedNumberOfFrogsJumps = 3;
        //when
        int result = Frog.solutionO1(x, y, s);
        //then
        assertEquals(expectedNumberOfFrogsJumps, result);
    }
}