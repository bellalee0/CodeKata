// https://school.programmers.co.kr/learn/courses/30/lessons/12931
// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
// 제한사항
// N의 범위 : 100,000,000 이하의 자연수

import java.util.Scanner;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int N = sc.nextInt();

        SumOfDigits sumOfDigits = new SumOfDigits();
        sumOfDigits.solution(N);
    }
}

class SumOfDigits {
    public void solution(int n) {
        int answer = 0;
        int initial = n;
        while (n > 0) {
            answer = answer + n % 10;
            n = n / 10;
        }

        System.out.println(initial + "의 각 자릿수의 합: " + answer);
    }
}