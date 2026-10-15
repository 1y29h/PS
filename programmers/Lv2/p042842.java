public class p042842 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42842
    // 카펫
    // ----------------------------------------------------------------------

    public int[] solution(int brown, int yellow) {
        for (int h = 1; h * h <= yellow; h++) {
            if (yellow % h != 0) continue;

            int w = yellow / h;
            if ((w + 2) * (h + 2) == brown + yellow) return new int[]{w + 2, h + 2};
        }

        return new int[]{};
    }
}