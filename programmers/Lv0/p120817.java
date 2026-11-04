public class p120817 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120817
    // 배열의 평균값
    // ----------------------------------------------------------------------

    public double solution(int[] numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return (double) sum / numbers.length;
    }
}