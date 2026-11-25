public class p120899 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120899
    // 가장 큰 수 찾기
    // ----------------------------------------------------------------------

    public int[] solution(int[] array) {
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[index] < array[i]) index = i;
        }

        return new int[]{array[index], index};
    }
}