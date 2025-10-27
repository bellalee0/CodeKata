// https://school.programmers.co.kr/learn/courses/30/lessons/12928
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
// 제한 사항
// n은 0 이상 3000이하인 정수입니다.

import java.util.Scanner;
import java.util.stream.IntStream;

public class 약수의_합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        SumOfDivisors sumOfDivisors = new SumOfDivisors();
        System.out.println(n + "의 약수의 합: " + sumOfDivisors.solution(n));
    }
}

class SumOfDivisors{
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

    public int briefV(int n) {
        int answer = 0;
        // n/2 이후에 나오는 약수는 n 자신 뿐이기에 for을 n/2까지만 반복하고, 결과에 n 더하기
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) answer += i;
        }
        return answer + n;
    }

    public int stream(int n) {
        int answer = 0;
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}