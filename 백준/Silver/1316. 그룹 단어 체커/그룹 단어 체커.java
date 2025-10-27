import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = word.charAt(0);
        seen[prev - 'a'] = true;

        for (int i = 1; i < word.length(); i++) {
            char now = word.charAt(i);
            if (now != prev) {
                if (seen[now - 'a']) {
                    return false;
                }
                seen[now - 'a'] = true;
            }
            prev = now;
        }
        return true;
    }
}
