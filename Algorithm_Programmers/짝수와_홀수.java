// https://school.programmers.co.kr/learn/courses/30/lessons/12937
// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
// 제한 조건
// num은 int 범위의 정수입니다.
// 0은 짝수입니다.

import java.util.Scanner;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("숫자(정수)를 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println("짝수: Even / 홀수: Odd 출력");
        CheckEven checkeven = new CheckEven();
        System.out.println(checkeven.solution(n));
    }
}

class CheckEven {
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}