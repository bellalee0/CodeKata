// https://school.programmers.co.kr/learn/courses/30/lessons/120802
// 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
// 제한사항
// -50,000 ≤ num1 ≤ 50,000
// -50,000 ≤ num2 ≤ 50,000

import java.util.Scanner;

public class 두_수의_합_구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1: ");
        int num1 = scanner.nextInt();
        System.out.print("숫자 2: ");
        int num2 = scanner.nextInt();

        if (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000 ) {
            Sum sum = new Sum();
            int answer = sum.solution(num1, num2);
            System.out.println(num1 + "+" + num2 + "=" + answer);
        } else {
            System.out.println("error: -50000 ~ 50000 사이의 값을 입력해주세요");
            // 에러 메시지 출력 후 다시 입력을 받게 하고 싶은데, 어떻게 하지?
        }
    }
}

class Sum {
    int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}
