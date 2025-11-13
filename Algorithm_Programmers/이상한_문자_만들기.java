// https://school.programmers.co.kr/learn/courses/30/lessons/12930
// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
// 제한 사항
// 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
// 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

import java.util.Arrays;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        MakingWeirdStrings makingWeirdStrings = new MakingWeirdStrings();
        makingWeirdStrings.solution("Hello it's me");
    }
}

class MakingWeirdStrings {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        for (int a = 0; a < arr.length; a++) {
            char[] charWord = arr[a].toCharArray();
            for (int i = 0; i < charWord.length; i++) {
                if (i % 2 == 0) {
                    charWord[i] = Character.toUpperCase(charWord[i]);
                } else {
                    charWord[i] = Character.toLowerCase(charWord[i]);
                }
            }
            arr[a] = new String(charWord);
        }
        return String.join(" ", arr);
    }

    public String solution2(String s) {
        String answer = "";
        int count = 0;
        for (int i=0; i < s.length(); i++) {
            String sub = s.substring(i,i+1);
            if (sub.equals(" ")) {
                answer += " ";
                count = 0;
            } else {
                answer += count % 2 == 0 ? sub.toUpperCase() : sub.toLowerCase();
                count++;
            }
        }
        return answer;
    }

    public String solution3(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}