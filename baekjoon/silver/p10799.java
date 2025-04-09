// 방법1 - 미친 비효율 코드

/*
import java.io.*;

public class p10799 {

    public static int findPlusFirstIndex(int [] arr, int n){
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 입력값
        String [] input = br.readLine().split("");
        int len = input.length;

        // 레이저 개수
        int laser = 0;

        // 레이저 개수 구하기
        for (int i = 1; i < input.length; i++) {
            if ((input[i].equals(")")) && (input[i - 1].equals("("))) {
                laser += 1;
            }
        }

        // 막대 개수
        int stick = 0;

        // 막대 개수 구하기
        for (int i = 1; i < input.length; i++) {
            if ((input[i].equals(")")) && (input[i-1].equals(")"))) {
                stick += 1;
            }
        }

        // 막대, 막대 길이용 배열 초기화. 막대 배열은 0, 길이 덧셈용은 1
        int [] stickLen = new int [len];
        int [] stickLenPlus = new int [len];
        for (int k = 0; k < len; k++) {
            stickLen[k] = 0;
            stickLenPlus[k] = 1;
        }

        // 레이저 인덱스 담을 배열
        int [] laserIndex = new int [laser];
        int laserIndexCount = 0;

        int index = 0;
        for (int i = 0; i < len; i++) {

            if ( input[i].equals(")") ) {
                if ( input[i-1].equals("(") ){
                    // 레이저
                    laserIndex[laserIndexCount] = i;
                    laserIndexCount += 1;
                    stickLen[i-1] = 0;
                    stickLenPlus[i-1]=0;
                    stickLenPlus[i] = 0;
                } else {
                    // 막대 완성
                    index = findPlusFirstIndex(stickLenPlus, i);
                    stickLenPlus[index] = 0;
                    stickLenPlus[i] = 0;
                }
            }

            for (int k = 0; k<=i; k++){
                stickLen[k] += stickLenPlus[k];
            }

        }

        // 막대 끝 인덱스 계산
        int stickLastIndex = 0;

        for (int k = 0; k < len; k++) {

            if (stickLen[k] > 0){
                stickLastIndex = k + stickLen[k];
                for (int m=0; m<laser; m++){
                    if ( (k < laserIndex[m]) && ( laserIndex[m] < stickLastIndex ) ){
                        stick += 1;
                    }
                }
            }

        }

        System.out.println(stick);

    }
}
 */

// 방법 2

import java.io.*;

public class p10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int result = 0;
        int open = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                open--;
                if (input.charAt(i - 1) == '(') {
                    result += open;
                } else {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}