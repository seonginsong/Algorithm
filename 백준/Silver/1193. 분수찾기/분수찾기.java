import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int line = 1;
        int sum = 0;

        while (sum < X) {
            sum += line;
            line++;
        }

        line--;
        int prevSum = sum - line;

        int pos = X - prevSum;

        int numerator, denominator;

        if (line % 2 == 0) {
            numerator = pos;
            denominator = line - pos + 1;
        } else {
            numerator = line - pos + 1;
            denominator = pos;
        }

        System.out.println(numerator + "/" + denominator);
        sc.close();
    }
}
