package codilityTasks;

public class BinaryTask {

    public int solution(int A, int B) {
        if (A >= 0 && A <= 100000000 && B >= 0 && B <= 100000000) {
            return Integer.bitCount(A * B);
        }
        return -1;
    }
}