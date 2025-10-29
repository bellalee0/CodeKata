// https://school.programmers.co.kr/learn/courses/30/lessons/12932
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
// 제한 조건
// n은 10,000,000,000이하인 자연수입니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        MakingArray makingArray = new MakingArray();
        int[] test = makingArray.stream(1234567890123456789L);
        System.out.println(Arrays.toString(test));
    }
}

class MakingArray {
    public int[] solution(long n) {
        String[] array = String.valueOf(n).split("");
        int[] answer = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            answer[i] = Integer.parseInt(array[array.length - 1 -i]);
        }
        return answer;
    }

    public int[] stream(long n) {
        ArrayList<String> array = new ArrayList<>(List.of(String.valueOf(n).split("")));
        Collections.reverse(array);
        return array.stream().mapToInt(Integer::parseInt).toArray();
    }
}