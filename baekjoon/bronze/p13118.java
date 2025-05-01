import java.io.*;
import java.util.*;

public class p13118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer people = new StringTokenizer(br.readLine(), " ");
        StringTokenizer circle = new StringTokenizer(br.readLine(), " ");
        int circleLocation = Integer.parseInt(circle.nextToken());
        int index = -1;

        for (int i = 0; i < 4; i++) {
            int peopleLocation = Integer.parseInt(people.nextToken());
            if (circleLocation == peopleLocation) {
                index = i;
                break;
            }
        }

        if (index >= 0) System.out.println(index + 1);
        else System.out.println(0);

    }
}