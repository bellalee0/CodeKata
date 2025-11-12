// https://school.programmers.co.kr/learn/courses/30/lessons/68935
// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
// 제한사항
// n은 1 이상 100,000,000 이하인 자연수입니다.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 삼진법_뒤집기 {
    public static void main(String[] args) {
        FlipTernary flipTernary = new FlipTernary();
        System.out.println(flipTernary.solution3(45));
    }
}

class FlipTernary {
    public int solution(int n) {
        String ternary = Integer.toString(n,3);
        List<String> list = Arrays.asList(ternary.split(""));
        Collections.reverse(list);
        return Integer.parseInt(String.join("", list), 3);
    }

    public int solution2(int n) {
        String answer = "";
        while (n > 0) {
            answer = answer + n % 3;
            n = n / 3;
        }
        return Integer.parseInt(answer, 3);
    }

    public int solution3(int n) {
        char[] ternary = Integer.toString(n,3).toCharArray();

        String answer = "";
        for (int i = 0; i < ternary.length; i++) {
            answer += ternary[ternary.length-1 - i];
        }

        return Integer.parseInt(answer, 3);
    }
}