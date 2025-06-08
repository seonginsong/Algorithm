import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		if(z%4==0 && z%100!=0 || z%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}
	
}
