package algorithms;

public class RecursionFibonacci {

    static int fibonacci (int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static void fibonacciSecond(int n){

        int t1 = 0;
        int t2 = 1;

        for(int i = 0; i < n; i++){
            System.out.println(t1 + " ");
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
