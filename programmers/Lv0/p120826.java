public class p120826 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120826
    // 특정 문자 제거하기
    // ----------------------------------------------------------------------

    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        char target = letter.charAt(0);

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == target) continue;
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}