import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int answer = 1;
        
        if (m1 == m2) {
            answer += d2 - d1;
        } else {
            for (int i = m1; i <= m2; i++) {
                if (i == m1) {
                    answer += days[i] - d1;
                } else if (i == m2) {
                    answer += d2;
                } else {
                    answer += days[i];
                }
            }
        }

        System.out.println(answer);
    }
}