package algorithms.practicetasks;

/**
 * ***THE FROG***
 * The little frog wants to get to the other side of the road.
 * Initially, it is located at the point x, and the end of the road is at the point y.
 * The frog always jumps by a distance equal to s.
 *
 * We wonder how many jumps will be performed by the frog
 * before jumping to the end or skipping the end of the road.
 *
 * Entry - The first line of entry contains 3 integers x, y, s (1 <= x < y, s <= 10 ^ 9)
 * meaning respectively: frog position, the end of the road and the length of the frog stroke.
 * Exit - The first and only line of the output should contain one integer equal to
 * the minimum number of jumps, after which the frog will jump to the end of the road or skip it.
 */
class Frog {

    static int solutionO1 (int x, int y, int s) {
        double result = 1 + (double) (y - x - 1) / s;
        return (int) result;
    }
}
