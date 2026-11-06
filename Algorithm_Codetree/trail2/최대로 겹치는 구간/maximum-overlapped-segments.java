import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            if (i == 0) {
                min = x1[i];
                max = x2[i];
            }

            if (min > x1[i]) {
                min = x1[i];
            }
            if (max < x2[i]) {
                max = x2[i];
            }
        }
        // Please write your code here.

        int size = max - min +1;
        int[] dots = new int[size];

        for (int i = 0; i < n; i++) {
            for (int j = x1[i] - min + 1; j < x2[i] - min + 1; j++) {
                dots[j]++;
            }
        }

        int result = 0;
        for (int i = 0; i < size; i++) {
            if (dots[i] > result) {
                result = dots[i];
            }
        }

        System.out.println(result);
    }
}