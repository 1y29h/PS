public class p001843 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/1843
    // 사칙연산
    // ----------------------------------------------------------------------

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
            for (int start = 0; start + size <= n; start++) {
                int end = start + size - 1;

                max[start][end] = Integer.MIN_VALUE;
                min[start][end] = Integer.MAX_VALUE;

                for (int mid = start; mid < end; mid++) {
                    int currentMax;
                    int currentMin;

                    if (arr[mid * 2 + 1].equals("+")) {
                        currentMax = max[start][mid] + max[mid + 1][end];
                        currentMin = min[start][mid] + min[mid + 1][end];
                    }
                    else {
                        currentMax = max[start][mid] - min[mid + 1][end];
                        currentMin = min[start][mid] - max[mid + 1][end];
                    }

                    max[start][end] = Math.max(max[start][end], currentMax);
                    min[start][end] = Math.min(min[start][end], currentMin);
                }
            }
        }

        return max[0][n - 1];
    }
}