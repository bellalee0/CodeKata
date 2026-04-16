// 11659 - 구간 합 구하기
// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지의 합 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int times = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();

        int[] sumArray = new int[size+1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= size; i++) {
            
            int num = Integer.parseInt(st.nextToken());

            sumArray[i] = sumArray[i-1] + num;
        }

        for (int i = 0; i < times; i++) {

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int answer = sumArray[end] - sumArray[start-1];

            result.append(answer).append("\n");
        }

        System.out.println(result);
    }
}