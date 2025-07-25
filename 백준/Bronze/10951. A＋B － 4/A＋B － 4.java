import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A+B);
		}
		sc.close();
	}
}