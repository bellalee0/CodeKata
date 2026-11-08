import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int[][] tiles = new int[200001][3]; // [][0]: 흰, [][1]: 검, [][2]: 최근색(흰:1, 검:2)
        int offset = 100000;
        int currentTile = offset;

        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') {
                for (int j = 0; j < x; j++) {
                    tiles[currentTile + j][1]++;
                    tiles[currentTile + j][2] = 2;
                }
                currentTile += (x - 1);
            } else {
                for (int j = 0; j < x; j++) {
                    tiles[currentTile - j][0]++;
                    tiles[currentTile - j][2] = 1;
                }
                currentTile -= (x - 1);
            }
        }

        for (int i = 0; i < 200001; i++) {

            if (tiles[i][0] >= 2 && tiles[i][1] >= 2) {
                gray++;
            } else if (tiles[i][0] > 0 && tiles[i][2] == 1) {
                white++;
            } else if (tiles[i][1] > 0 && tiles[i][2] == 2) {
                black++;
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}