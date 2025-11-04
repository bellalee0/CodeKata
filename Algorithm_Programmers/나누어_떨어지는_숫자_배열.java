// https://school.programmers.co.kr/learn/courses/30/lessons/12910
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
// 제한사항
// arr은 자연수를 담은 배열입니다.
// 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
// divisor는 자연수입니다.
// array는 길이 1 이상인 배열입니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};

        DivisibleNumber divisibleNumber = new DivisibleNumber();
        System.out.println(divisibleNumber.solution(arr, 5));
    }
}

class DivisibleNumber {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        int[] answer = {-1};
        return list.isEmpty() ? answer : list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(num -> num % divisor == 0).sorted().toArray();
        if (answer.length == 0) { answer = new int[]{-1}; }
        return answer;
    }
}