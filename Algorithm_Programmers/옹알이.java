// https://school.programmers.co.kr/learn/courses/30/lessons/133499
// 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
// 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
// 제한사항
// 1 ≤ babbling의 길이 ≤ 100
// 1 ≤ babbling[i]의 길이 ≤ 30
// 문자열은 알파벳 소문자로만 이루어져 있습니다.

public class 옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};

        Babbling babbling1 = new Babbling();
        System.out.println(babbling1.solution(babbling));
    }
}

class Babbling {
    public int solution(String[] babbling) {

        int answer = 0;

        // 발음 가능한 단어 배열
        String[] canBabble = {"aya", "ye", "woo", "ma"};

        // 입력 문자열 배열을 순회
        for (String word : babbling) {
            boolean isValid = true;

            // 연속된 같은 발음을 방지하기 위한 초기화
            String prev = "";

            // 발음 가능한 단어를 대체하며 검증
            for (String sound : canBabble) {
                // 연속 발음을 체크
                if (word.contains(sound + sound)) {
                    isValid = false;
                    break;
                }
                // 발음 가능한 단어를 모두 제거
                word = word.replace(sound, " ");
            }

            // 검증: 모든 발음 가능한 단어 제거 후 남은 문자열이 공백이어야 함
            if (isValid && word.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}