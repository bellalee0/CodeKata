// https://school.programmers.co.kr/learn/courses/30/lessons/138477
// 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.

import java.util.Arrays;
import java.util.Collections;

public class 명예의_전당 {
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        HallOfFame hallOfFame = new HallOfFame();
        System.out.println(Arrays.toString(hallOfFame.solution(3, score)));
    }
}

class HallOfFame {
    public int[] solution(int k, int[] score) {
        // 1. score 내림차순 정렬
        // 2. 앞에서부터 k번째까지 자르기
        // 3. 잘린 배열에서 가장 작은 값 반환
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            Integer[] temp = Arrays.stream(Arrays.copyOfRange(score, 0, i+1)).boxed().toArray(Integer[]::new);
            Arrays.sort(temp, Collections.reverseOrder());
            answer[i] = temp[k-1 > i ? i : k-1];
        }

        return answer;
    }
}