import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] dots = new int[101];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j <= end; j++) {
                dots[j]++;
                if (dots[j] > max) {
                    max = dots[j];
                }
            }
        }

        System.out.println(max);
    }
}