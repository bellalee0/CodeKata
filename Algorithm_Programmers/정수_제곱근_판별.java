// https://school.programmers.co.kr/learn/courses/30/lessons/12934
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
// 제한 사항
// n은 1이상, 50000000000000 이하인 양의 정수입니다.

import java.util.Scanner;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        FindSquareRoot findSquareRoot = new FindSquareRoot();
        System.out.println(findSquareRoot.solution(a));
    }
}

class FindSquareRoot {
    public long solution(long n) {
        double squareRoot = Math.sqrt(n);
        long answer = -1;
        if (squareRoot % 1 == 0) {
            answer = (long) ((squareRoot + 1) * (squareRoot + 1));
        }
        return answer;
    }

    public long solution2(long n) {
        if (Math.sqrt(n) % 1 == 0) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);  // Math.pow(밑, 지수) : 거듭제곱 double로 반환
        }
        return -1;
    }
}