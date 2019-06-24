package codilityTasks;

public class SkyLine {

    public int solution(int[] A) {

        if (A.length == 0 || A == null || A.length > 100000) {
            return -1;
        } else {

            int largestNumber = 0;

            for (int element : A) {
                if(element < 1 || element > 1000000000) {
                    return -1;
                } else if (element > largestNumber) {
                    largestNumber = element;
                }
            }

            int brushstrokes = 0;

            for (int i = 0; i <= largestNumber; i++) {
                boolean paintStripe = false;

                for(int element : A) {
                    if(!paintStripe && element >= (i+1)) {
                        brushstrokes++;
                        paintStripe = true;
                    } else if (paintStripe && element < (i+1)) {
                        paintStripe = false;
                    }
                }
            }

            if (brushstrokes > 1000000000) {
                return -1;
            } else {
                return brushstrokes;
            }
        }
    }
}
