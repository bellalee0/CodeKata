// https://school.programmers.co.kr/learn/courses/30/lessons/142086
// 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
// 문자열 s가 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.
// 제한사항
// 1 ≤ s의 길이 ≤ 10,000
// s은 영어 소문자로만 이루어져 있습니다.

import java.util.Arrays;

public class 가장_가까운_같은_글자 {
    static void main() {
        String s = "foobar";

        FindSameText findSameText = new FindSameText();
        System.out.println(Arrays.toString(findSameText.solution(s)));
    }
}

class FindSameText {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.lastIndexOf(s.charAt(i), i-1);
            answer[i] = answer[i] == -1 ? -1 : i - answer[i];
        }

        return answer;
    }
}