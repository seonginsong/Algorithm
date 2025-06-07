import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		if(90<=z) {
			System.out.println("A");
		} else if (80<=z) {
			System.out.println("B");
		} else if (70<=z) {
			System.out.println("C");
		} else if (60<=z) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
	
}
