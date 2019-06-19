package algorithms.practicetasks;
/**
Problem: For given n calculate the sum of integers from 1 to n
 **/
class SumOfIntForGivenN {

// fast solution n < 10 000, n < 1 000 000, n < 10^10
    static int solutionO1(int n) {
        return n * (n+1)/2;

    }
// slow solution n < 10 000, n < 1 000 000
    static int solutionOn(int n) {
        int result = 0;
        for (int i = 1; i <=n; i++) {
            result += i;
        }
        return result;
    }
// brute solution n < 10 000
    static int solutionOn2(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                result++;
            }
        }
        return result;
    }
}
