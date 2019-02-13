package org.pursuit.junittestingappfromscratchparttwo.helper;

import java.util.Arrays;

public class NumberHelper {

    private static NumberHelper instance;

    public static NumberHelper getInstance() {
        if (instance == null) {
            instance = new NumberHelper();
        }
        return instance;
    }

    private NumberHelper() {

    }

    public String oddOrEven(int input) {
        String even = "even";
        String odd = "odd";
        if (input % 2 == 0) {
            return even.toLowerCase();
        } else return odd.toLowerCase();
    }

    public boolean divisibleBy5(int input) {
        return input % 5 == 0;
    }

    public int[] multiplesOfN(int baseNumber, int range) {

        int[] arr = new int[range];
        for (int i = 0; i < range; i++) {

            arr[i] = baseNumber * (i + 1);
        }
        return arr;
    }

    public int stringToNumber(String number) {

        return Integer.parseInt(number);
    }

    public int arraySum(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }

    public int largestNumber(int[] numbers) {

        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public int[] numberSort(int[] numbers) {

        Arrays.sort(numbers);

        return numbers;
    }
    }




