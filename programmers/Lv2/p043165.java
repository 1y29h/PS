public class p043165 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    // 타겟 넘버
    // ----------------------------------------------------------------------

    int answer = 0;
    int[] numbers;
    int target;

    public void cal(int index, int total, int remain) {
        if (Math.abs(target - total) > remain) return;

        if (index == numbers.length) {
            if (total == target) answer++;
            return;
        }

        int num = numbers[index];
        cal(index + 1, total + num, remain - num);
        cal(index + 1, total - num, remain - num);
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        int remain = 0;
        for (int num : numbers) remain += num;

        cal(0, 0, remain);

        return answer;
    }
}