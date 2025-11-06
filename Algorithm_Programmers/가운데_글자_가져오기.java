// https://school.programmers.co.kr/learn/courses/30/lessons/12903
// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
// 재한사항
// s는 길이가 1 이상, 100이하인 스트링입니다.

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        String s = "hello";

        GetMiddleLetter getMiddleLetter = new GetMiddleLetter();
        System.out.println(getMiddleLetter.solution(s));
    }
}

class GetMiddleLetter {
    public String solution(String s) {
        char[] charString = s.toCharArray();
        if (charString.length % 2 == 0) {
            return new String(new char[] {charString[charString.length / 2 -1], charString[charString.length / 2]});
        } else {
            return new String(String.valueOf(charString[(charString.length) / 2]));
        }
    }

    public String solution2(String s) {
        s.substring((s.length()-1)/2, s.length()/2+1); // substr(int beginIndex, int endIndex) : beginIndex 포함, endIndex 미포함
        return s;
    }
}