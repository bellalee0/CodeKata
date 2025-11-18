// https://school.programmers.co.kr/learn/courses/30/lessons/81301
// 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";

        ReplaceStringToNum replaceStringToNum = new ReplaceStringToNum();
        System.out.println(replaceStringToNum.solution(s));
    }
}

class ReplaceStringToNum {
    public int solution(String s) {
        String[] engNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i <= 9; i++) {
            s = s.replaceAll(engNum[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}