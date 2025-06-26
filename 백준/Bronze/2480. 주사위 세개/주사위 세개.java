import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==b && b==c) {
				System.out.println(10000+a*1000);
			} else if (a!=b && b!=c && a!=c) {
				int mostInt = 1;
				if(a>=b && a>=c) {
					mostInt = a;
				} else if(b>a && b>c) {
					mostInt = b;
				} else {
					mostInt = c;
				}
				System.out.println(mostInt * 100);
			} else {
				int sameInt = 1;
				if(a==b && b!=c) {
					sameInt = a;
				} else if(a==c && b!=c) {
					sameInt = a;
				} else {
					sameInt = b;
				}
				System.out.println(1000+sameInt*100);
			}
	}

}
