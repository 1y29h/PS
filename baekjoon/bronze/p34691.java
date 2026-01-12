import java.io.*;

public class p34691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while (true) {
            str = br.readLine();
            if (str.equals("end")) break;

            if (str.equals("animal")) sb.append("Panthera tigris").append('\n');
            else if (str.equals("flower")) sb.append("Forsythia koreana").append('\n');
            else if (str.equals("tree")) sb.append("Pinus densiflora").append('\n');
        }

        System.out.print(sb);

    }
}