// https://school.programmers.co.kr/learn/courses/30/lessons/160586
// 이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 합니다.
// 1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때, 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.
// 단, 목표 문자열을 작성할 수 없을 때는 -1을 저장합니다.

import java.util.Arrays;
import java.util.OptionalInt;

public class 대충_만든_자판 {
    public static void main(String argsp[]) {

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        Keyboard keyboard = new Keyboard();
        keyboard.solution(keymap, targets);

    }
}

class Keyboard {
    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {

            int count = 0;

            for (char c : targets[i].toCharArray()) {

                int[] temp = new int[keymap.length];

                for (int j = 0; j < keymap.length; j++) {

                    if (keymap[j].contains(String.valueOf(c))) {
                        temp[j] = keymap[j].indexOf(String.valueOf(c)) + 1;
                    }
                }

                OptionalInt min = Arrays.stream(temp).filter(n -> n != 0).min();

                if (min.isPresent()) {
                    count += min.getAsInt();
                } else {
                    count = -1;
                    break;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}