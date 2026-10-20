public class p043105 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43105
    // 정수 삼각형
    // ----------------------------------------------------------------------

    public int solution(int[][] triangle) {

        for (int row = 1; row < triangle.length; row++) {
            for (int col = 0; col < triangle[row].length; col++) {

                if (col == 0) triangle[row][col] += triangle[row - 1][col];
                else if (col == triangle[row].length - 1) triangle[row][col] += triangle[row - 1][col - 1];
                else triangle[row][col] += Math.max(triangle[row - 1][col - 1], triangle[row - 1][col]);

            }
        }

        int answer = 0;

        for (int value : triangle[triangle.length - 1]) {
            answer = Math.max(answer, value);
        }

        return answer;
    }
}