import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int layer = 1;
        int max = 1;

        while (N > max) {
            max += 6 * layer;
            layer++;
        }

        System.out.println(layer);
        sc.close();
    }
}
