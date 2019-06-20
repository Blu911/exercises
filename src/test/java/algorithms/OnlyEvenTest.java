package algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnlyEvenTest {

    @Test
    public void shouldReturnOnlyEvenAndUniqueIntegers() {
        //given
        int[] array = {1, 3, 4, 6, 8, 2, 4, 10, 10};
        int[] expectedArray = {2, 4, 6, 8, 10};
        //when
        int[] result = OnlyEven.onlyEvenAndNoRepetition(array);
        int[] secondResult = OnlyEven.onlyEvenAndUnique(array);
        //then
        Assert.assertArrayEquals(expectedArray,result);
        Assert.assertArrayEquals(expectedArray,secondResult);
    }
}