import java.util.*;

public class p042839 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42839
    // 소수 찾기
    // ----------------------------------------------------------------------

    Set<Integer> nums = new HashSet<>();
    boolean[] used;
    String numbers;

    public void make(String str) {
        for (int i = 0; i < numbers.length(); i++) {
            if (used[i]) continue;

            used[i] = true;

            String next = str + numbers.charAt(i);
            nums.add(Integer.parseInt(next));
            make(next);

            used[i] = false;
        }
    }

    public boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public int solution(String numbers) {
        this.numbers = numbers;
        used = new boolean[numbers.length()];

        make("");

        int answer = 0;

        for (int num : nums) {
            if (isPrime(num)) answer++;
        }

        return answer;
    }
}