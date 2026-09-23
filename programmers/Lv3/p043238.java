public class p043238 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43238
    // 입국 심사
    // ----------------------------------------------------------------------

    public long total(long time, int[] times) {
        long count = 0;

        for (int t : times) {
            count += time / t;
        }

        return count;
    }

    public long solution(int n, int[] times) {
        long right = 1;

        while (total(right, times) < n) {
            right *= 2;
        }

        long left = right / 2;

        while (right - left > 1) {
            long mid = left + (right - left) / 2;

            if (total(mid, times) < n) left = mid;
            else right = mid;
        }

        return right;
    }
}