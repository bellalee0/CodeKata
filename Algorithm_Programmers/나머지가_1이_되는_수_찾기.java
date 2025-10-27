// https://school.programmers.co.kr/learn/courses/30/lessons/87389
// 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.
// 제한사항
// 3 ≤ n ≤ 1,000,000

import java.util.Scanner;
import java.util.stream.IntStream;

public class 나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        NumberMakesRemainder1 numberMakesRemainder1 = new NumberMakesRemainder1();
        System.out.println("나머지가 1이 되게 하는 가장 작은 자연수: " + numberMakesRemainder1.solution(n));
    }
}

class NumberMakesRemainder1 {
    public int solution(int n) {
        int answer = 0;
        if (n >= 3 && n <= 1000000) {
            for (answer = 1; answer <= n; answer++) {
                if (n % answer == 1) break;
            }
        }
        return answer;
    }

    public int usingWhile(int n) {
        int answer = 0;
        while (n >= 3 && n <= 1000000) {
            if (n % answer == 1) break;
            answer++;
        }
        return answer;
    }

    public int stream(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}