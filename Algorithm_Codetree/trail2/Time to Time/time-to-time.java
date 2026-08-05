import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int targetHour = sc.nextInt();
        int targetMin = sc.nextInt();

        int start = 60 * hour + min;
        int end = 60 * targetHour + targetMin;

        System.out.println(end - start);
    }
}