// https://school.programmers.co.kr/learn/courses/30/lessons/12944
// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
// 제한사항
// arr은 길이 1 이상, 100 이하인 배열입니다.
// arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

import java.util.Arrays;

public class 평균_구하기 {
    public static void main(String[] args) {
        int[] test = {3, 4, 5, 6, 7, 8};

        ArrayAverage arrayAverage = new ArrayAverage();
        System.out.println("for문 활용: " + arrayAverage.solution(test));
        System.out.println("Stream 활용: " + arrayAverage.stream(test));
    }
}

class ArrayAverage {
    public double solution(int[] arr) {
        double sum = 0;
        if (arr.length >= 1 && arr.length <= 100) {
            for (int number : arr) {
                if (number >= -10000 && number <= 10000) sum += number;
            }
        }
        return sum/arr.length;
    }

    public double stream(int[] arr) {
        return Arrays.stream(arr).filter(n -> n>=-10000 && n<=10000).average().getAsDouble();
    }
}