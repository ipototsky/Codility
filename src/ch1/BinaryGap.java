package ch1;

/**
 * Created by Pototsky Ivan on 6/27/17.
 */
public class BinaryGap {
    public int solution(int N) {
        int result = 0;
        int currentGapCounter = 0;
        boolean lastBit = false;
        while (N > 0) {
            if ((N & 1) == 1) {
                if (currentGapCounter > result) {
                    result = currentGapCounter;
                }
                currentGapCounter = 0;
            } else {
                if (lastBit) {
                    currentGapCounter = 1;
                } else {
                    if (currentGapCounter > 0) {
                        currentGapCounter++;
                    }
                }
            }
            lastBit = (N & 1) == 1;
            N >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer i = 12;
        BinaryGap gap = new BinaryGap();
        int result = gap.solution(i);
        System.out.println(result);
    }
}
