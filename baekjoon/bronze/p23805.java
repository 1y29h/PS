// 방법 1

//import java.io.*;
//
//public class p23805 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//
//        String [][] box = new String[5][5];
//        for (int i=0; i<5; i++) {
//            for (int j=0; j<5; j++) {
//                if ( (j==3)&&(i!=4) ) box[i][j] = " ";
//                else if ((j==1)&&(i!=0)) box[i][j] = " ";
//                else box[i][j] = "@";
//            }
//        }
//
//        for (int i=0; i<5; i++) {
//            for (int count=0; count<N; count++) {
//                for (int j=0; j<5; j++) {
//                    sb.append(box[i][j].repeat(N));
//                }
//                sb.append("\n");
//            }
//        }
//
//        System.out.println(sb);
//
//    }
//}

// 방법 2

import java.io.*;

public class p23805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<5; i++) {
            for (int cnt = 0; cnt < N; cnt++) {
                for (int j = 0; j < 5; j++) {
                    String box = "@";
                    if ((j == 3 && i != 4) || (j == 1 && i != 0)) box = " ";
                    sb.append(box.repeat(N));
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }
}