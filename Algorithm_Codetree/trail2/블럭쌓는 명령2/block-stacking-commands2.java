import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] blocks = new int[N];
        int K = sc.nextInt();
        int max = 0;
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A; j <= B; j++) {
                blocks[j-1]++;
                if (blocks[j-1] > max) {
                    max = blocks[j-1];
                }
            }
        }
        // Please write your code here.
        System.out.println(max);
    }
}