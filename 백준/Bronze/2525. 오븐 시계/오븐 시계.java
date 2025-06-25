import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 추가 분

        int totalMinutes = B + C;
        int addedHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;
        int newHours = (A + addedHours) % 24; // 24시 넘으면 0~23 순환

        System.out.println(newHours + " " + newMinutes);
    }
}