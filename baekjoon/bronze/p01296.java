import java.io.*;

public class p01296 {

    static int L = 0;
    static int O = 0;
    static int V = 0;
    static int E = 0;

    static int Probability(int tL, int tO, int tV, int tE) {
        return ((tL+L + tO+O) * (tL+L + tV+V) * (tL+L + tE+E) * (tO+O + tV+V) * (tO+O + tE+E) * (tV+V + tE+E)) % 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String yGreen = br.readLine();
        int N = Integer.parseInt(br.readLine());

        String team;
        int tL, tO, tV, tE;

        int score = 0;
        String win = "";

        for (int i=0; i<yGreen.length(); i++) {
            if (yGreen.charAt(i) == 'L') L++;
            else if (yGreen.charAt(i) == 'O') O++;
            else if (yGreen.charAt(i) == 'V') V++;
            else if (yGreen.charAt(i) == 'E') E++;
        }

        for (int i=0; i<N; i++) {
            team = br.readLine();

            tL = 0;
            tO = 0;
            tV = 0;
            tE = 0;

            for (int j=0; j<team.length(); j++) {
                if (team.charAt(j) == 'L') {
                    tL++;
                } else if (team.charAt(j) == 'O') {
                    tO++;
                } else if (team.charAt(j) == 'V') {
                    tV++;
                } else if (team.charAt(j) == 'E') {
                    tE++;
                }
            }
            if (score < Probability(tL, tO, tV, tE) || win.equals("")) {
                score = Probability(tL, tO, tV, tE);
                win = team;
            } else if (score == Probability(tL, tO, tV, tE)) {
                if (win.compareTo(team) > 0) {
                    score = Probability(tL, tO, tV, tE);
                    win = team;
                }
            }
        }

        System.out.print(win);

    }
}