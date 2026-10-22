public class p001843 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/1843
    // 사칙연산
    // ----------------------------------------------------------------------

    public int calculate(int fir, int sec, String symbol) {
        if (symbol.equals("+")) return fir + sec;
        return fir - sec;
    }

    public int solution(String[] arr) {
        int n = arr.length / 2 + 1;
        int[][] max = new int[n][n];
        int[][] min = new int[n][n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i * 2]);
            max[i][i] = num;
            min[i][i] = num;
        }

        for (int size = 2; size <= n; size++) {
            for (int start = 0; start + size - 1 < n; start++) {
                int end = start + size - 1;

                max[start][end] = Integer.MIN_VALUE;
                min[start][end] = Integer.MAX_VALUE;

                for (int mid = start; mid < end; mid++) {
                    String symbol = arr[mid * 2 + 1];

                    int maxValue;
                    int minValue;

                    if (symbol.equals("+")) {
                        maxValue = calculate(max[start][mid], max[mid + 1][end], symbol);
                        minValue = calculate(min[start][mid], min[mid + 1][end], symbol);
                    }

                    else {
                        maxValue = calculate(max[start][mid], min[mid + 1][end], symbol);
                        minValue = calculate(min[start][mid], max[mid + 1][end], symbol);
                    }

                    max[start][end] = Math.max(max[start][end], maxValue);
                    min[start][end] = Math.min(min[start][end], minValue);
                }
            }
        }

        return max[0][n - 1];
    }
}