// https://school.programmers.co.kr/learn/courses/30/lessons/12926
// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
// 제한 조건
// 공백은 아무리 밀어도 공백입니다.
// s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
// s의 길이는 8000이하입니다.
// n은 1 이상, 25이하인 자연수입니다.

public class 시저_암호 {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.solution("abc", 2));
    }
}

class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii == 32) { ascii = 32; }
            else if (ascii >= 65 && ascii <= 90) {
                ascii += n;
                if (ascii > 90) { ascii -= 26; }
            } else {
                ascii += n;
                if (ascii > 122) { ascii -= 26; }
            }
            answer += (char) ascii;
        }
        return answer;
    }

    public String solution2(String s, int n) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }
            result += c;
        }
        return result;
    }

    public String solution3(String s, int n) {
        return s.chars().map(c -> {
                    if (c >= 'a' && c <= 'z') {
                        return 'a' + (c - 'a' + n) % 26;
                    } else if (c >= 'A' && c <= 'Z') {
                        return 'A' + (c - 'A' + n) % 26;
                    } else {
                        return c;
                    }
                }).mapToObj(c -> String.valueOf((char)c))
                .reduce((a, b) -> a + b).orElse("");
    }
}