// https://school.programmers.co.kr/learn/courses/30/lessons/42840
// 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
// 제한 조건
// 시험은 최대 10,000 문제로 구성되어있습니다.
// 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
// 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};

        MockExam mockExam = new MockExam();
        System.out.println(Arrays.toString(mockExam.solution(answer)));
    }
}

class MockExam {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int score1 = 0;
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int score2 = 0;
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if ( answers[i] == person1[i%5] ) {
                score1++;
            }
            if ( answers[i] == person2[i%8] ) {
                score2++;
            }
            if ( answers[i] == person3[i%10] ) {
                score3++;
            }
        }

        int[] answer = {score1, score2, score3};
        int maxScore = Arrays.stream(answer).max().getAsInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 2; i++) {
            if (maxScore == answer[i]) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}