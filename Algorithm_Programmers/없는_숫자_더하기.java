// https://school.programmers.co.kr/learn/courses/30/lessons/86051
// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
// 제한사항
// 1 ≤ numbers의 길이 ≤ 9
// 0 ≤ numbers의 모든 원소 ≤ 9
// numbers의 모든 원소는 서로 다릅니다.


import java.util.Arrays;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        SumNotIncludedNumber sumNotIncludedNumber = new SumNotIncludedNumber();
        System.out.println(sumNotIncludedNumber.solution(numbers));
    }
}

class SumNotIncludedNumber {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public int solution2(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}