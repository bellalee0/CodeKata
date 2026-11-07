import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] line = new int[2001];
        int offset = 1000;
        int result = 0;
        int currentIndex = 0 + offset;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.

            int nextIndex = currentIndex;
            switch (dir) {
                case 'L': nextIndex -= x; break;
                case 'R': nextIndex += x; break;
            }

            int left = currentIndex < nextIndex ? currentIndex : nextIndex;
            int right = currentIndex > nextIndex ? currentIndex : nextIndex;

            for (int j = left; j < right; j++) {
                line[j]++;
            }

            currentIndex = nextIndex;
        }

        for (int i = 0; i <= 2000; i++) {
            if (line[i] > 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}