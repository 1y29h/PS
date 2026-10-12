import java.util.*;

public class p086491 {
    public int solution(int[][] sizes) {
        int height = 0;
        int width = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
            height = Math.max(height, size[0]);
            width = Math.max(width, size[1]);
        }

        return height * width;
    }
}