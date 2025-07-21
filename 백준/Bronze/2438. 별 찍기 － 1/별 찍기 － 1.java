import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String star = "";
			int i = 0;
			for(i=1; i<=N; i++) {
				star += "*";
				System.out.println(star);
			}
	}

}