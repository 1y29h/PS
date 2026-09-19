import java.util.*;

public class p001845 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/1845
    // 폰켓몬
    // ----------------------------------------------------------------------

    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return Math.min(nums.length / 2, map.size());
    }
}