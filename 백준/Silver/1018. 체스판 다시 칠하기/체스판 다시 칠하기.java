import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;


        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, repaint(board, i, j));
            }
        }

        System.out.println(min);
    }


    static int repaint(char[][] board, int x, int y) {
        int white = 0;
        int black = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {

                char expected = ((i + j) % 2 == 0) ? 'W' : 'B';

                if (board[i][j] != expected) white++;
                if (board[i][j] == expected) black++;
            }
        }
        return Math.min(white, black);
    }
}
