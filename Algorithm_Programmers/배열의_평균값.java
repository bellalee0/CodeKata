// https://school.programmers.co.kr/learn/courses/30/lessons/120817
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
// 제한사항
// 0 ≤ numbers의 원소 ≤ 1,000
// 1 ≤ numbers의 길이 ≤ 100
// 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

import java.util.Arrays;

public class 배열의_평균값 {
    public static void  main(String[] args){
        int[] test = {3, 4, 5, 6, 7, 8};

        Average average = new Average();
        System.out.println("for문 활용: " + average.solution(test));
        System.out.println("Stream 활용: " + average.stream(test));
    }
}

class Average {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        int i;
        if (numbers.length>=1 && numbers.length<=100) {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i]>=0 && numbers[i]<=1000) sum += numbers[i];
            }
        }
        answer = sum / numbers.length;
        return answer;
    }
    public double stream(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n>0 && n<=1000).average().getAsDouble();
    }
}