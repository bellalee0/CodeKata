// 11659 - 구간 합 구하기
// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지의 합 구하기

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int times = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        int[] sumArray = new int[size+1];

        for (int i = 1; i <= size; i++) {
            
            int num = scanner.nextInt();

            sumArray[i] = sumArray[i-1] + num;
        }

        for (int i = 0; i < times; i++) {

            int start = scanner.nextInt();
            int end = scanner.nextInt();

            int answer = sumArray[end] - sumArray[start-1];

            result.append(answer).append("\n");
        }

        System.out.println(result);

        scanner.close();
    }
}