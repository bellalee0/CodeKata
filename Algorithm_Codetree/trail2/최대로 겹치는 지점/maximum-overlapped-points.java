import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        int[] dots = new int[101];
        int max = 0;

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            for (int j = start[i]; j <= end[i]; j++) {
                dots[j]++;
                if (dots[j] > max) {
                    max = dots[j];
                }
            }
        }

        System.out.println(max);
    }
}