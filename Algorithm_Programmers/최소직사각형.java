// https://school.programmers.co.kr/learn/courses/30/lessons/86491
// 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {
                {60, 50}, {30, 70}, {60, 30}, {80, 40}
        };

        SmalliestRectangle smalliestRectangle = new SmalliestRectangle();
        System.out.println(smalliestRectangle.solution(sizes));
    }
}

class SmalliestRectangle {
    public int solution(int[][] sizes) {
        int[] smaller = new int[sizes.length];
        int[] bigger = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            smaller[i] = Math.min(sizes[i][0], sizes[i][1]);
            bigger[i] = Math.max(sizes[i][0], sizes[i][1]);
        }

        Arrays.sort(smaller);
        Arrays.sort(bigger);

        return smaller[sizes.length-1] * bigger[sizes.length-1];
    }

    public int solution2(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}