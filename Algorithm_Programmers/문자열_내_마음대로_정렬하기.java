// https://school.programmers.co.kr/learn/courses/30/lessons/12915
// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
// 제한 조건
// strings는 길이 1 이상, 50이하인 배열입니다.
// strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
// strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
// 모든 strings의 원소의 길이는 n보다 큽니다.
// 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        SortString sortString = new SortString();
        System.out.println(Arrays.toString(sortString.solution(strings, n)));
    }
}

class SortString {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparing((String s) -> s.charAt(n))
                        .thenComparing(Comparator.naturalOrder()))
                .toArray(String[]::new);
    }

    public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                // n번째 문자 비교
                if (s1.charAt(n) != s2.charAt(n)) {
                    // 아스키코드 값 비교
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
                // n번째 문자가 같은 경우, 사전순으로 비교
                return s1.compareTo(s2);
            }
        });
        return strings;
    }

    public String[] solution3(String[] strings, int n) {
        // n번째 문자를 처음에 배치
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        // 전체 사전순으로 정렬
        Collections.sort(arr);
        // 처음 문자 제외하고 반환
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}