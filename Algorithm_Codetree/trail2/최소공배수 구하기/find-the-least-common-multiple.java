import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int smaller = n < m ? n : m;

        int divisor = 0;
        for (int i = 1; i <= smaller; i++) {
            if (n % i == 0 && m % i == 0) {
                divisor = i;
            }
        }

        System.out.println((n * m) / divisor);
    }
}