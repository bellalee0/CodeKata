// 2750 - 수 정렬하기
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        
        int[] numArr = new int[total];
        for (int i = 0; i < total; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < total; i++) {
            result.append(numArr[i]).append("\n");
        }
        System.out.println(result);
    }
}