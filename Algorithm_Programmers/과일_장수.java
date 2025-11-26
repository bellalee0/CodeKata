// https://school.programmers.co.kr/learn/courses/30/lessons/135808
// 사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
// 제한사항
// 3 ≤ k ≤ 9
// 3 ≤ m ≤ 10
// 7 ≤ score의 길이 ≤ 1,000,000
// 1 ≤ score[i] ≤ k
// 이익이 발생하지 않는 경우에는 0을 return 해주세요.

import java.util.Arrays;
import java.util.Comparator;

public class 과일_장수 {
    public static void main(String[] args) {
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        FruitSeller fruitSeller = new FruitSeller();
        System.out.println(fruitSeller.solution(4, 3, score));

    }
}

class FruitSeller {
    public int solution(int k, int m, int[] score) {
        Integer[] sortedScore = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        int answer = 0;
        for (int i = 1; i <= sortedScore.length/m; i++) {
            answer += sortedScore[m*i - 1] * m;
        }
        return answer;
    }
}