package ch8;

/**
 * Equilibrium Index.
 * Codility 100%. O(n) complexity.
 * Created by Pototsky Ivan on 6/26/17.
 */
public class EquiLeader {
    public int solution(int[] array) {
        long sumAll = 0;
        long sumElementsBefore[] = new long[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sumElementsBefore[i] = sumAll;
            }
            sumAll += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (sumElementsBefore[i] == sumAll - sumElementsBefore[i] - array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-1, 3, -4, 5, 1, -6, 2, 1};
        EquiLeader equiLeader = new EquiLeader();
        equiLeader.solution(array);
    }
}
