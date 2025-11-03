import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] paper = new boolean[100][100];
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    paper[i][j] = true;
                }
            }
        }

        int area = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) area++;
            }
        }

        System.out.println(area);
        sc.close();
    }
}
