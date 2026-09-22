import java.util.*;

public class p042579 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42579
    // 베스트앨범
    // ----------------------------------------------------------------------

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> total = new HashMap<>();
        HashMap<String, List<Integer>> songs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            total.put(genre, total.getOrDefault(genre, 0) + play);
            if (!songs.containsKey(genre)) songs.put(genre, new ArrayList<>());
            songs.get(genre).add(i);
        }

        List<String> sortedGenres = new ArrayList<>(total.keySet());
        sortedGenres.sort((a, b) -> total.get(b) - total.get(a));

        List<Integer> tmpRes = new ArrayList<>();
        for (String str : sortedGenres) {
            List<Integer> list = songs.get(str);
            list.sort((a, b) -> {
                if (plays[a] == plays[b]) return a - b;
                return plays[b] - plays[a];
            });

            tmpRes.add(list.get(0));
            if (list.size() > 1) tmpRes.add(list.get(1));
        }

        int[] res = new int[tmpRes.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmpRes.get(i);
        }

        return res;
    }
}