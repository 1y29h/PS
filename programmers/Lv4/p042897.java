public class p042897 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42897
    // 도둑질
    // ----------------------------------------------------------------------

    public int solution(int[] money) {
        int[] includeFirst = new int[money.length];
        int[] excludeFirst = new int[money.length];

        includeFirst[0] = money[0];
        includeFirst[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < money.length - 1; i++) {
            includeFirst[i] = Math.max(includeFirst[i - 1], money[i] + includeFirst[i - 2]);
        }

        excludeFirst[1] = money[1];
        excludeFirst[2] = Math.max(money[1], money[2]);

        for (int i = 3; i < money.length; i++) {
            excludeFirst[i] = Math.max(excludeFirst[i - 1], money[i] + excludeFirst[i - 2]);
        }

        return Math.max(includeFirst[money.length - 2], excludeFirst[money.length - 1]);
    }
}