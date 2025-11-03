import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > maxLen) {
                maxLen = arr[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < maxLen; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i].length() > j) {
                    sb.append(arr[i].charAt(j));
                }
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
