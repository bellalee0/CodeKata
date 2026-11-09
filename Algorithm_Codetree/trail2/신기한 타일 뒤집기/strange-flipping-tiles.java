import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int offset = 100000;
        int[] tiles = new int[200001]; // 1: 흰, 2: 검
        int current = offset;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);


            if (d == 'L') { // 흰색으로
                for (int j = 0; j < x; j++) {
                    tiles[current - j] = 1;
                }
                current -= (x - 1);
            } else { // 검정으로
                for (int j = 0; j < x; j++) {
                    tiles[current + j] = 2;
                }
                current += (x - 1);
            }
        }

        int white = 0;
        int black = 0;

        for (int i = 0; i < 200001; i++) {
            switch (tiles[i]) {
                case 1: white++; break;
                case 2: black++; break;
            }
        }

        System.out.println(white + " " + black);
    }
}