package org.pursuit.junittestingappfromscratchparttwo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pursuit.junittestingappfromscratchparttwo.helper.NumberHelper;

public class NumberHelperUnitTest {

    private NumberHelper numberHelper;

    @Before
    public void setUp() throws Exception {
        numberHelper = NumberHelper.getInstance();

    }

    @Test
    public void check_Odd_Or_Even_isEven() {
        String answer = "even";
        String value = numberHelper.oddOrEven(4);
        Assert.assertEquals(answer, value);
    }

    @Test
    public void check_Odd_Or_Even_isOdd() {
        String answer = "odd";
        String value = numberHelper.oddOrEven(5);
        Assert.assertEquals(answer, value);
    }

    @Test
    public void check_divisibleBy5_true() {
        boolean answer = true;
        boolean value = numberHelper.divisibleBy5(25);
        Assert.assertEquals(answer, value);
    }

    @Test
    public void check_divisibleBy5_isFalse() {
        boolean answer = false;
        boolean value = numberHelper.divisibleBy5(31);
        Assert.assertEquals(answer, value);
    }

    @Test
    public void check_multiplesOfN() {
        int[] answer = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] value = numberHelper.multiplesOfN(3, 10);
        Assert.assertArrayEquals(answer, value);


    }

    @Test
    public void checkstringToNumber() {
        int answer = 5;
        int value = numberHelper.stringToNumber("5");
        Assert.assertEquals(answer, value);
    }

    @Test
    public void check_arraySum() {
        int answer = 6;
        int[] arr = new int[]{1, 2, 3};
        int value = numberHelper.arraySum(arr);
    }

    @Test
    public void check_largestNumber() {
        int answer = 6;
        int[] arr = new int[]{1, 2, 6, 3};
        int value = numberHelper.largestNumber(arr);
    }


    @After
    public void tearDown() throws Exception {
        numberHelper = null;
    }
}
