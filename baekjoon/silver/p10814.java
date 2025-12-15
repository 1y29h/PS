import java.io.*;
import java.util.*;

public class p10814 {

    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int age;
        String name;
        Member [] members = new Member[N];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            age = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            members[i] = new Member(age, name);
        }

        Arrays.sort(members, (a, b) -> a.age - b.age);

        for (Member m : members) {
            sb.append(m.age).append(" ").append(m.name).append('\n');
        }
        System.out.print(sb);
    }

}