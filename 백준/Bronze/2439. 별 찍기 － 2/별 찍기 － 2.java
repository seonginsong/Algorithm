import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String star = "";
			String blank = "";
			int i = 0;
			for(i=1; i<=N; i++) {
				star += "*";
				blank = "";
				for(int k=1; k<=N-i; k++) {
					blank += " ";
				}
				System.out.println(blank+star);
			}
	}

}