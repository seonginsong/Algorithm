import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double[] arr = new double[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		double M = arr[0];
		for(int i = 0; i<N; i++) {
			if(M<=arr[i]) {
				M = arr[i];
			}
		}
		for(int i = 0; i<N; i++) {
			arr[i] = arr[i]/M*100;
		}
		double avg = 0;
		for(int i = 0; i<N; i++) {
			avg += arr[i];
		}
		System.out.print(avg/N);
    }
}
