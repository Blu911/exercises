package algorithms.practicetasks;

/**
 * ***THE PAVEMENT***
 * Ed wrote all integers from 1 to n on the sidewalk in a random order.
 * Then he went to the store. Upon returning, he noticed that one number was missing.
 * Help Ed and tell him which number is missing!
 *
 * Input - The first line of the input contains one integer n (1 <= n <= 500,000),
 * which indicates how many numbers Ed wrote.
 * The next line contains n-1 integers l0, l1, ..., ln-2 (1 <= li <= n),
 * where li means the i-th number on the pavement (after Ed's return from the store).
 *
 * Exit - The first and only line of the output should contain one integer - the number
 * that is missing on the pavement.
 */
class Pavement {

    static int solution(int n, int[] l) {

        double nSum = (double) (1 + n) / 2 * n;
        double lSum = 0;
        for (int element : l) {
            lSum += element;
        }
        return (int) (nSum - lSum);
    }
}
