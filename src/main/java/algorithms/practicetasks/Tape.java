package algorithms.practicetasks;

/**
 * ***THE TAPE***
 * Janek found a long tape at home. Without a moment's reflection, he wrote a sequence
 * of integers on the tape. Now he would like to cut the tape in a certain place,
 * so that the difference between the sum of numbers on one piece and the sum of numbers
 * on the second piece is as close to zero as possible.
 * We would like to know the absolute value of this difference.
 *
 * Input - The first line of the input contains one integer n (2 <= n <= 1,000,000),
 * denoting the number of numbers on the tape.
 * The second line of input contains n integers a0, a1, ..., an-1 (- 1000 <= ai <= 1000),
 * where ai means the i-th number written on the tape.
 *
 * Exit - The first and only line of the output should contain one integer, equal to
 * the minimum absolute value of the sum difference of numbers on both pieces of the tape.
 */
class Tape {

    static int solution(int n, int[] a) {
        int result = 0;
        int pivot = n / 2;
        int difference = -1;
        boolean isSmallest = false;

        while (!isSmallest) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int i = 0; i < a.length; i++) {
                if (i <= pivot) {
                    sumLeft += a[i];
                } else {
                    sumRight += a[i];
                }
            }
            int currentDifference = Math.abs(sumLeft - sumRight);

            if (currentDifference == 0) {
                return currentDifference;
            }

            if (difference != -1 && difference <= currentDifference) {
                isSmallest = true;
                result = difference;
            }
            if (sumLeft > sumRight) {
                pivot--;
            } else {
                pivot++;
            }
            difference = currentDifference;
        }
        return result;
    }
}
