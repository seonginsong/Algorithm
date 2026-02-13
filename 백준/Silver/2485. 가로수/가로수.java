import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int g = arr[1] - arr[0];
        for (int i = 2; i < N; i++) {
            g = gcd(g, arr[i] - arr[i - 1]);
        }

        int total = (arr[N - 1] - arr[0]) / g + 1;
        System.out.println(total - N);
    }
}
